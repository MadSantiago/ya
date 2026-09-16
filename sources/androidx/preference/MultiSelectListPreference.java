package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.HashSet;
import p000.AbstractC0186;
import p000.AbstractC2188;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {
    /* JADX WARN: Illegal instructions before constructor call */
    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        int iM435 = AbstractC0186.m435(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle);
        super(context, attributeSet, iM435);
        new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2188.f7255, iM435, 0);
        if (typedArrayObtainStyledAttributes.getTextArray(2) == null) {
            typedArrayObtainStyledAttributes.getTextArray(0);
        }
        if (typedArrayObtainStyledAttributes.getTextArray(3) == null) {
            typedArrayObtainStyledAttributes.getTextArray(1);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: ۥؗ */
    public final Object mo79(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }
}
