package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p000.AbstractC2188;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class SeekBarPreference extends Preference {

    /* JADX INFO: renamed from: ۥۖ */
    public final int f224;

    /* JADX INFO: renamed from: ۦۛ */
    public final int f225;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2188.f7262, R.attr.seekBarPreferenceStyle, 0);
        int i = typedArrayObtainStyledAttributes.getInt(3, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(1, 100);
        i2 = i2 < i ? i : i2;
        if (i2 != this.f225) {
            this.f225 = i2;
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(4, 0);
        if (i3 != this.f224) {
            this.f224 = Math.min(this.f225 - i, Math.abs(i3));
        }
        typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.getBoolean(5, false);
        typedArrayObtainStyledAttributes.getBoolean(6, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: ۥؗ */
    public final Object mo79(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }
}
