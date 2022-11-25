package com.ead.commons.lib.resource

import android.app.Activity
import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat

fun Activity.getDrawableFromId(resourceId : Int) : Drawable? =
    ResourcesCompat.getDrawable(resources,resourceId,theme)

fun Activity.getDrawableFromIdNotNull(resourceId : Int) : Drawable =
    getDrawableFromId(resourceId)!!

fun Activity.getColorIdFromResource(resourceId: Int) : Int =
    ContextCompat.getColor(this,resourceId)