package slb.mypopcornapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;

import slb.popcornsdk.Network.DownloadImageTask;
import slb.popcornsdk.data.page.APage;

/**
 * Created by snrla on 03/07/2017.
 */

public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    private ArrayList<APage> _page;

    public ImageAdapter(Context c, ArrayList<APage> page) {
        mContext = c;
        _page = page;
    }

    public int getCount() {
        return _page.size();
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(300, 300));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }
        new DownloadImageTask(imageView)
                .execute(_page.get(position).getImages().getPoster());
       // imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }


}
