package com.demo.advanced.daggerhilt.util

import android.widget.ImageView
import androidx.appcompat.widget.AppCompatImageView
import androidx.databinding.BindingAdapter
import coil.api.load
import com.bumptech.glide.Glide

object BindingAdapters {

//    @BindingAdapter("imageUrl")
//    @JvmStatic
//    fun loadImage(imageView: AppCompatImageView, url: String?) {
//        url?.let { imageView.loadUrl(it) }
//    }

    fun ImageView.loadUrl(url: String) {
        this.load(url)
    }

    @BindingAdapter("imageUrl")
    @JvmStatic
    fun loadImage(imageView: AppCompatImageView, url: String?) {
        url?.let {
            Glide.with(imageView.context)
                .load(it)
                .into(imageView)
        }
    }

}