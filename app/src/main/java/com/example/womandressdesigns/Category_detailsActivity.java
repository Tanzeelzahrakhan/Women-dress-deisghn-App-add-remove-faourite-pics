package com.example.womandressdesigns;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.example.womandressdesigns.Adapter.SliderAdapter;
import com.example.womandressdesigns.Model.SliderModel;
import com.example.womandressdesigns.databinding.ActivityCategoryDetailsBinding;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class Category_detailsActivity extends AppCompatActivity {
ActivityCategoryDetailsBinding binding;
SliderAdapter adapter;
int currentPosition;
SliderModel currentImageRes;
BitmapDrawable bitmapDrawable;
Bitmap bitmap;
String ctgryname;
int i=0;
ArrayList<SliderModel>imageslist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_details);
        binding=ActivityCategoryDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ctgryname=getIntent().getStringExtra("name");
        binding.ctgryname.setText(ctgryname);
        imageslist=new ArrayList<>();



        if (ctgryname.equals("Mahndi Dresses Designs")){

            imageslist.add(new SliderModel(R.drawable.madi));
            imageslist.add(new SliderModel(R.drawable.bueaty));
            imageslist.add(new SliderModel(R.drawable.green));
            imageslist.add(new SliderModel(R.drawable.mbridal));
            imageslist.add(new SliderModel(R.drawable.mhndibridal));
            imageslist.add(new SliderModel(R.drawable.mhndidesign));
            imageslist.add(new SliderModel(R.drawable.orange));
            imageslist.add(new SliderModel(R.drawable.orangegreen));
            imageslist.add(new SliderModel(R.drawable.simple));
            imageslist.add(new SliderModel(R.drawable.yellow));
            imageslist.add(new SliderModel(R.drawable.yellowgreen));
            imageslist.add(new SliderModel(R.drawable.yellowlanga));
            imageslist.add(new SliderModel(R.drawable.yellowlook));
            imageslist.add(new SliderModel(R.drawable.yellowpink));
            imageslist.add(new SliderModel(R.drawable.beautifulgirl));
            imageslist.add(new SliderModel(R.drawable.bluepink));
            imageslist.add(new SliderModel(R.drawable.bridalgreen));
            imageslist.add(new SliderModel(R.drawable.brown));
            imageslist.add(new SliderModel(R.drawable.darkgreen));
            imageslist.add(new SliderModel(R.drawable.darkmahron));
            imageslist.add(new SliderModel(R.drawable.frock));
            imageslist.add(new SliderModel(R.drawable.frontdesign));
            imageslist.add(new SliderModel(R.drawable.greensuit));
            imageslist.add(new SliderModel(R.drawable.hideface));
            imageslist.add(new SliderModel(R.drawable.hijab));
            imageslist.add(new SliderModel(R.drawable.lightyellow));
            imageslist.add(new SliderModel(R.drawable.mahron));
            imageslist.add(new SliderModel(R.drawable.nimra));
            imageslist.add(new SliderModel(R.drawable.orangegirl));
            imageslist.add(new SliderModel(R.drawable.orangelangha));
            imageslist.add(new SliderModel(R.drawable.pink));
            imageslist.add(new SliderModel(R.drawable.red));
            imageslist.add(new SliderModel(R.drawable.shortshairt));
            imageslist.add(new SliderModel(R.drawable.smiling));
            imageslist.add(new SliderModel(R.drawable.smilinggirl));
            imageslist.add(new SliderModel(R.drawable.parpelgirl));
            imageslist.add(new SliderModel(R.drawable.grayyellow));
            imageslist.add(new SliderModel(R.drawable.purplep));
            imageslist.add(new SliderModel(R.drawable.saba));
            imageslist.add(new SliderModel(R.drawable.sad));
            imageslist.add(new SliderModel(R.drawable.sara));
            imageslist.add(new SliderModel(R.drawable.shirt));
            imageslist.add(new SliderModel(R.drawable.silk));
            imageslist.add(new SliderModel(R.drawable.simar));
            imageslist.add(new SliderModel(R.drawable.sit));
            imageslist.add(new SliderModel(R.drawable.sky));
            imageslist.add(new SliderModel(R.drawable.stage));
            imageslist.add(new SliderModel(R.drawable.stand));
            imageslist.add(new SliderModel(R.drawable.stndmndi));
            imageslist.add(new SliderModel(R.drawable.style));
            imageslist.add(new SliderModel(R.drawable.walk));
            imageslist.add(new SliderModel(R.drawable.yelows));

            adapter=new SliderAdapter(imageslist);
            binding.imageSlider.setSliderAdapter(adapter);

        }
        else if (ctgryname.equals("Bridal Dresses Designs")){

            imageslist.add(new SliderModel(R.drawable.afshan));
            imageslist.add(new SliderModel(R.drawable.alizashah));
            imageslist.add(new SliderModel(R.drawable.afshanbrid));
            imageslist.add(new SliderModel(R.drawable.attractiveb));
            imageslist.add(new SliderModel(R.drawable.ayza));
            imageslist.add(new SliderModel(R.drawable.ayzabride));
            imageslist.add(new SliderModel(R.drawable.backb));
            imageslist.add(new SliderModel(R.drawable.ayzabridal));
            imageslist.add(new SliderModel(R.drawable.backgroundbrid));
            imageslist.add(new SliderModel(R.drawable.beautyred));
            imageslist.add(new SliderModel(R.drawable.begstyle));
            imageslist.add(new SliderModel(R.drawable.birdesmile));
            imageslist.add(new SliderModel(R.drawable.bluebrid));
            imageslist.add(new SliderModel(R.drawable.bmhron));
            imageslist.add(new SliderModel(R.drawable.bridalbrid));
            imageslist.add(new SliderModel(R.drawable.bridalls));
            imageslist.add(new SliderModel(R.drawable.bskin));
            imageslist.add(new SliderModel(R.drawable.bstyle));
            imageslist.add(new SliderModel(R.drawable.bueatybrid));
            imageslist.add(new SliderModel(R.drawable.chinese));
            imageslist.add(new SliderModel(R.drawable.clrbridals));
            imageslist.add(new SliderModel(R.drawable.coupleb));
            imageslist.add(new SliderModel(R.drawable.couplebride));
            imageslist.add(new SliderModel(R.drawable.dulhan));
            imageslist.add(new SliderModel(R.drawable.haniamir));
            imageslist.add(new SliderModel(R.drawable.happycouple));
            imageslist.add(new SliderModel(R.drawable.heavy));
            imageslist.add(new SliderModel(R.drawable.heavyfrock));
            imageslist.add(new SliderModel(R.drawable.iqraziza));
            imageslist.add(new SliderModel(R.drawable.kanwal));
            imageslist.add(new SliderModel(R.drawable.mahirakhan));
            imageslist.add(new SliderModel(R.drawable.iqraziza));
            imageslist.add(new SliderModel(R.drawable.mahronb));
            imageslist.add(new SliderModel(R.drawable.mariyam));
            imageslist.add(new SliderModel(R.drawable.mask));
            imageslist.add(new SliderModel(R.drawable.maxib));
            imageslist.add(new SliderModel(R.drawable.mhronmaxi));
            imageslist.add(new SliderModel(R.drawable.minhalbrid));
            imageslist.add(new SliderModel(R.drawable.mirrorb));
            imageslist.add(new SliderModel(R.drawable.muneeb));
            imageslist.add(new SliderModel(R.drawable.pretty));
            imageslist.add(new SliderModel(R.drawable.saboor));
            imageslist.add(new SliderModel(R.drawable.sanajavad));
            imageslist.add(new SliderModel(R.drawable.shoulder));
            imageslist.add(new SliderModel(R.drawable.sitbrid));
            imageslist.add(new SliderModel(R.drawable.sofa));
            imageslist.add(new SliderModel(R.drawable.stageb));
            imageslist.add(new SliderModel(R.drawable.stears));
            imageslist.add(new SliderModel(R.drawable.whiteflower));
            imageslist.add(new SliderModel(R.drawable.alizashah));
            imageslist.add(new SliderModel(R.drawable.bridal));

            adapter=new SliderAdapter(imageslist);
            binding.imageSlider.setSliderAdapter(adapter);
        }
        else if(ctgryname.equals("Walima Dresses Designs")){
            imageslist.add(new SliderModel(R.drawable.trendingmuslimbridal));
            imageslist.add(new SliderModel(R.drawable.couplewalimadress));
            imageslist.add(new SliderModel(R.drawable.wilmapic));
            imageslist.add(new SliderModel(R.drawable.valimabridaloutfitsaretrending));
            imageslist.add(new SliderModel(R.drawable.valimabride));
            imageslist.add(new SliderModel(R.drawable.valimabridedressinspo));
            imageslist.add(new SliderModel(R.drawable.valimacouplegray));
            imageslist.add(new SliderModel(R.drawable.valimadress));
            imageslist.add(new SliderModel(R.drawable.valimaskfbridals));
            imageslist.add(new SliderModel(R.drawable.valimmalightpinkdress));
            imageslist.add(new SliderModel(R.drawable.walimaadresss));
            imageslist.add(new SliderModel(R.drawable.walimaalightbluedrs));
            imageslist.add(new SliderModel(R.drawable.walimaattractiveivory));
            imageslist.add(new SliderModel(R.drawable.waliabridal));
            imageslist.add(new SliderModel(R.drawable.walimabeautifuldress));
            imageslist.add(new SliderModel(R.drawable.walimablackdress));
            imageslist.add(new SliderModel(R.drawable.walimablackpinkdress));
            imageslist.add(new SliderModel(R.drawable.walimabridalwear));
            imageslist.add(new SliderModel(R.drawable.walimabridedressinspo));
            imageslist.add(new SliderModel(R.drawable.walimabrowndress));
            imageslist.add(new SliderModel(R.drawable.walimacollection));
            imageslist.add(new SliderModel(R.drawable.walimacoupledesign));
            imageslist.add(new SliderModel(R.drawable.walimacoupledress));
            imageslist.add(new SliderModel(R.drawable.walimacoupleskindresss));
            imageslist.add(new SliderModel(R.drawable.walimadarkgreen));
            imageslist.add(new SliderModel(R.drawable.walimadresign));
            imageslist.add(new SliderModel(R.drawable.walimadress));
            imageslist.add(new SliderModel(R.drawable.walimadressaminakhan));
            imageslist.add(new SliderModel(R.drawable.walimadressescollection));
            imageslist.add(new SliderModel(R.drawable.walimadressess));
            imageslist.add(new SliderModel(R.drawable.walimadressskin));
            imageslist.add(new SliderModel(R.drawable.walimadresswedding));
            imageslist.add(new SliderModel(R.drawable.walimadresswhite));
            imageslist.add(new SliderModel(R.drawable.walimagreenbride));
            imageslist.add(new SliderModel(R.drawable.walimagreendresss));
            imageslist.add(new SliderModel(R.drawable.walimagresslightdress));
            imageslist.add(new SliderModel(R.drawable.walimahavedress));
            imageslist.add(new SliderModel(R.drawable.walimaheavydresssd));
            imageslist.add(new SliderModel(R.drawable.walimalightbluecolor));
            imageslist.add(new SliderModel(R.drawable.walimalightblueskinclor));
            imageslist.add(new SliderModel(R.drawable.walimalightclordress));
            imageslist.add(new SliderModel(R.drawable.walimalighttclordress));
            imageslist.add(new SliderModel(R.drawable.walimama));
            imageslist.add(new SliderModel(R.drawable.walimamuslimbridal));
            imageslist.add(new SliderModel(R.drawable.walimanavebluedress));
            imageslist.add(new SliderModel(R.drawable.walimanisanurmodaevi));
            imageslist.add(new SliderModel(R.drawable.walimaoffwhite));
            imageslist.add(new SliderModel(R.drawable.walimaorangrezafull));
            imageslist.add(new SliderModel(R.drawable.walimapinkdress));
            imageslist.add(new SliderModel(R.drawable.weddingdresses));
            imageslist.add(new SliderModel(R.drawable.walimashararadesign));





            adapter=new SliderAdapter(imageslist);
            binding.imageSlider.setSliderAdapter(adapter);

        }
        else if(ctgryname.equals("Party Dresses Designs")){

            imageslist.add(new SliderModel(R.drawable.partylanghadesign));
            imageslist.add(new SliderModel(R.drawable.partylatestdesign));
            imageslist.add(new SliderModel(R.drawable.partylightbluedress));
            imageslist.add(new SliderModel(R.drawable.partyhijabdress));
            imageslist.add(new SliderModel(R.drawable.partylightcolordesign));
            imageslist.add(new SliderModel(R.drawable.partymaxi));
            imageslist.add(new SliderModel(R.drawable.partypurplecoupledesignerdress));
            imageslist.add(new SliderModel(R.drawable.partypichdrress));
            imageslist.add(new SliderModel(R.drawable.partyredblackdress));
            imageslist.add(new SliderModel(R.drawable.partyreddress));
            imageslist.add(new SliderModel(R.drawable.partyskinpeachdress));
            imageslist.add(new SliderModel(R.drawable.partyshortfroke));
            imageslist.add(new SliderModel(R.drawable.partystylishweardresforgirls));
            imageslist.add(new SliderModel(R.drawable.partysuitdesigning));
            imageslist.add(new SliderModel(R.drawable.partythreadsandmotifs));
            imageslist.add(new SliderModel(R.drawable.partyweardressesidea));
            imageslist.add(new SliderModel(R.drawable.partywearlongmaxidesign));
            imageslist.add(new SliderModel(R.drawable.partywhitebrowndress));
            imageslist.add(new SliderModel(R.drawable.partywhiteorangedress));
            imageslist.add(new SliderModel(R.drawable.partywhitedresss));
            imageslist.add(new SliderModel(R.drawable.partywholesale));
            imageslist.add(new SliderModel(R.drawable.partyyablueweddinggown));
            imageslist.add(new SliderModel(R.drawable.partytopdesign));
            imageslist.add(new SliderModel(R.drawable.partyyablueweddinggown));
            imageslist.add(new SliderModel(R.drawable.partydress));
            imageslist.add(new SliderModel(R.drawable.partyydesignerdresses));
            imageslist.add(new SliderModel(R.drawable.partycoupledress));
            imageslist.add(new SliderModel(R.drawable.partydarkbluedress));
            imageslist.add(new SliderModel(R.drawable.partydesign));
            imageslist.add(new SliderModel(R.drawable.partydresdesigns));
            imageslist.add(new SliderModel(R.drawable.partydesigndress));
            imageslist.add(new SliderModel(R.drawable.partydressskyclor));
            imageslist.add(new SliderModel(R.drawable.patyydress));
            imageslist.add(new SliderModel(R.drawable.partyfullmaxidesign));
            imageslist.add(new SliderModel(R.drawable.partygraydesign));
            imageslist.add(new SliderModel(R.drawable.partygrayydress));
            imageslist.add(new SliderModel(R.drawable.pakistanipartydresses));
            imageslist.add(new SliderModel(R.drawable.partyheavydress));
            imageslist.add(new SliderModel(R.drawable.paertylightgreendres));
            imageslist.add(new SliderModel(R.drawable.partyblackredclor));
            imageslist.add(new SliderModel(R.drawable.partybabydress));
            imageslist.add(new SliderModel(R.drawable.partyabluedarkdresss));
            imageslist.add(new SliderModel(R.drawable.partybeautifuldress));
            imageslist.add(new SliderModel(R.drawable.partybeautifullehngadesign));
            imageslist.add(new SliderModel(R.drawable.partyblackreddress));
            imageslist.add(new SliderModel(R.drawable.partyblackmaxi));
            imageslist.add(new SliderModel(R.drawable.partyshrarradesign));
            imageslist.add(new SliderModel(R.drawable.partywhiteredclor));
            imageslist.add(new SliderModel(R.drawable.partydarkbluee));



            adapter=new SliderAdapter(imageslist);
            binding.imageSlider.setSliderAdapter(adapter);

        }
        else if(ctgryname.equals("Birthday Dresses Designs")){

            imageslist.add(new SliderModel(R.drawable.amaindress));
            imageslist.add(new SliderModel(R.drawable.amanminal));
            imageslist.add(new SliderModel(R.drawable.amianblackdress));
            imageslist.add(new SliderModel(R.drawable.arshipink));
            imageslist.add(new SliderModel(R.drawable.babypink));
            imageslist.add(new SliderModel(R.drawable.baloons));
            imageslist.add(new SliderModel(R.drawable.birthdaygirlsdress));
            imageslist.add(new SliderModel(R.drawable.birthdress));
            imageslist.add(new SliderModel(R.drawable.blackdress));
            imageslist.add(new SliderModel(R.drawable.blackskin));
            imageslist.add(new SliderModel(R.drawable.bluedress));
            imageslist.add(new SliderModel(R.drawable.bluedresse));
            imageslist.add(new SliderModel(R.drawable.bluefulldress));
            imageslist.add(new SliderModel(R.drawable.browndress));
            imageslist.add(new SliderModel(R.drawable.cuteacter));
            imageslist.add(new SliderModel(R.drawable.emandress));
            imageslist.add(new SliderModel(R.drawable.eyesclr));
            imageslist.add(new SliderModel(R.drawable.fullskydress));
            imageslist.add(new SliderModel(R.drawable.gliterdress));
            imageslist.add(new SliderModel(R.drawable.graydress));
            imageslist.add(new SliderModel(R.drawable.greenbirthdress));
            imageslist.add(new SliderModel(R.drawable.greendress));
            imageslist.add(new SliderModel(R.drawable.handstyles));
            imageslist.add(new SliderModel(R.drawable.iqradress));
            imageslist.add(new SliderModel(R.drawable.kainatbeauty));
            imageslist.add(new SliderModel(R.drawable.kainatdress));
            imageslist.add(new SliderModel(R.drawable.mahrondress));
            imageslist.add(new SliderModel(R.drawable.mhrondressings));
            imageslist.add(new SliderModel(R.drawable.minalprint));
            imageslist.add(new SliderModel(R.drawable.mirrordress));
            imageslist.add(new SliderModel(R.drawable.neckstyle));
            imageslist.add(new SliderModel(R.drawable.nyladress));
            imageslist.add(new SliderModel(R.drawable.orangebirthdress));
            imageslist.add(new SliderModel(R.drawable.orangeclr));
            imageslist.add(new SliderModel(R.drawable.orangeprint));
            imageslist.add(new SliderModel(R.drawable.orangedress));
            imageslist.add(new SliderModel(R.drawable.pinkdress));
            imageslist.add(new SliderModel(R.drawable.purpledress));
            imageslist.add(new SliderModel(R.drawable.redbeauty));
            imageslist.add(new SliderModel(R.drawable.reddress));
            imageslist.add(new SliderModel(R.drawable.sahri));
            imageslist.add(new SliderModel(R.drawable.sanabirth));
            imageslist.add(new SliderModel(R.drawable.sawiradrss));
            imageslist.add(new SliderModel(R.drawable.shoulderstyledress));
            imageslist.add(new SliderModel(R.drawable.sisbirth));
            imageslist.add(new SliderModel(R.drawable.sislove));
            imageslist.add(new SliderModel(R.drawable.sixdesign));
            imageslist.add(new SliderModel(R.drawable.skindress));
            imageslist.add(new SliderModel(R.drawable.skydress));
            imageslist.add(new SliderModel(R.drawable.stachudress));
            imageslist.add(new SliderModel(R.drawable.threesis));
            imageslist.add(new SliderModel(R.drawable.tiktoker));
            imageslist.add(new SliderModel(R.drawable.twoclrdress));
            imageslist.add(new SliderModel(R.drawable.uniqadress));
            imageslist.add(new SliderModel(R.drawable.urwadress));
            imageslist.add(new SliderModel(R.drawable.watch));
            imageslist.add(new SliderModel(R.drawable.whitewatch));
            imageslist.add(new SliderModel(R.drawable.whitedress));
            imageslist.add(new SliderModel(R.drawable.whitegowndress));
            imageslist.add(new SliderModel(R.drawable.whitesuits));
            imageslist.add(new SliderModel(R.drawable.yumnadress));

            adapter=new SliderAdapter(imageslist);
            binding.imageSlider.setSliderAdapter(adapter);

        }


        else {
            Toast.makeText(this, "No data found", Toast.LENGTH_SHORT).show();
        }



        binding.rightArrowImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int currentPosition = binding.imageSlider.getCurrentPagePosition();
                if (currentPosition < adapter.getCount() - 1) {
                    binding.imageSlider.setCurrentPagePosition(currentPosition + 1);
                }
            }
        });

binding.Arrowimg.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        int currentPosition = binding.imageSlider.getCurrentPagePosition();
        if (currentPosition > 0) {
            binding.imageSlider.setCurrentPagePosition(currentPosition - 1);
        }
    }
});





        binding.shareImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bitmap image=getBitmapFromView(binding.imageSlider);
                 shareImageAndText(image);
            }
        });

       }

    private void shareImageAndText(Bitmap image) {
        Uri uri=getImageToShare(image);
        Intent intent=new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_STREAM,uri);
        intent.putExtra(Intent.EXTRA_SUBJECT,"Dress design");
        intent.setType("images/jpg");
        startActivity(Intent.createChooser(intent,"Shared image Via:"));
    }

    private Uri getImageToShare(Bitmap image) {
        File imageFolder=new File(getCacheDir(),"images");
        Uri uri=null;
        try {
            imageFolder.mkdirs();
            File file=new File(imageFolder,"shared_image.jpg");
            FileOutputStream outputStream=new FileOutputStream(file);
            image.compress(Bitmap.CompressFormat.JPEG,100,outputStream);
            outputStream.flush();
            outputStream.close();
            uri= FileProvider.getUriForFile(this,"com.dress.shareImage.fileProvider",file);

        }catch (Exception e){
            Toast.makeText(this, ""+e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        return uri;

    }

    private Bitmap getBitmapFromView(View view) {
        Bitmap returnedBitmap=Bitmap.createBitmap(view.getWidth(),view.getHeight(),Bitmap.Config.ARGB_8888);
        Canvas convas=new Canvas(returnedBitmap);
        Drawable background=view.getBackground();
        if (background!=null){
            background.draw(convas);

        }else {
            convas.drawColor(Color.WHITE);
        }
        view.draw(convas);
        return returnedBitmap;

    }
}