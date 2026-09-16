package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p000.AbstractC0186;
import p000.AbstractC2188;
import p000.C3223;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    /* JADX WARN: Illegal instructions before constructor call */
    public EditTextPreference(Context context, AttributeSet attributeSet) {
        int iM435 = AbstractC0186.m435(context, R.attr.editTextPreferenceStyle, android.R.attr.editTextPreferenceStyle);
        super(context, attributeSet, iM435);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2188.f7254, iM435, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(0, typedArrayObtainStyledAttributes.getBoolean(0, false))) {
            C3223 c3223 = C3223.f10835;
            if (c3223 == null) {
                c3223 = new C3223(6);
                C3223.f10835 = c3223;
            }
            this.f221 = c3223;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: ۥؗ */
    public final Object mo79(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }
}
