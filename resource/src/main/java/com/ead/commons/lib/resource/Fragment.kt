package com.ead.commons.lib.resource

import android.graphics.drawable.Drawable
import androidx.fragment.app.Fragment


fun Fragment.getDrawableFromId(resourceId : Int) : Drawable? =
    requireActivity().getDrawableFromId(resourceId)

fun Fragment.getDrawableFromIdNotNull(resourceId : Int) : Drawable =
    requireActivity().getDrawableFromIdNotNull(resourceId)

fun Fragment.getColorIdFromResource(resourceId: Int) : Int =
    requireActivity().getColorIdFromResource(resourceId)