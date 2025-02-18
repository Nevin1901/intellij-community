// "Add ''Parcelable'' supertype" "false"
// IGNORE_IRRELEVANT_ACTIONS
// WITH_STDLIB

package com.myapp.activity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

abstract class AbstractParcelable : Parcelable

@Parcelize
class <caret>Test(val s: String) : AbstractParcelable()