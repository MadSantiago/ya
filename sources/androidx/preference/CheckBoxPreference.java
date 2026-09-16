package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p000.AbstractC0186;
import p000.AbstractC2188;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    /* JADX WARN: Illegal instructions before constructor call */
    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        int iM435 = AbstractC0186.m435(context, R.attr.checkBoxPreferenceStyle, android.R.attr.checkBoxPreferenceStyle);
        super(context, attributeSet, iM435);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2188.f7259, iM435, 0);
        if (typedArrayObtainStyledAttributes.getString(5) == null) {
            typedArrayObtainStyledAttributes.getString(0);
        }
        if (typedArrayObtainStyledAttributes.getString(4) == null) {
            typedArrayObtainStyledAttributes.getString(1);
        }
        typedArrayObtainStyledAttributes.getBoolean(3, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }
}
