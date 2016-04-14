package com.llbt.meepwn.lincoinblock.utils;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.llbt.meepwn.lincoinblock.R;
import com.squareup.picasso.Picasso;

/**
 * package: com.llbt.meepwn.lincoinblock.utils
 * author: MeePwn
 * email: maybewaityou@gmail.com
 * github: https://github.com/maybewaityou
 * date: 16/4/13 下午12:33
 * desc: 图片加载
 */
public class ImageLoader {

    @BindingAdapter({"bind:imageUrl"})
    public static void loadImage(ImageView imageView, String url) {
        // TODO 修改error时展示的图片
        Picasso.with(imageView.getContext()).load(url).error(R.mipmap.ic_launcher).into(imageView);
    }

}
