package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import p000.AbstractC0186;
import p000.AbstractC2188;
import p000.C4036;
import p000.InterfaceC4132;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* JADX INFO: renamed from: ۥۖ */
    public final String f215;

    /* JADX INFO: renamed from: ۦۛ */
    public final CharSequence[] f216;

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2188.f7260, i, 0);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.f216 = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        if (typedArrayObtainStyledAttributes.getTextArray(3) == null) {
            typedArrayObtainStyledAttributes.getTextArray(1);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(4, typedArrayObtainStyledAttributes.getBoolean(4, false))) {
            C4036 c4036 = C4036.f13461;
            if (c4036 == null) {
                c4036 = new C4036(16);
                C4036.f13461 = c4036;
            }
            this.f221 = c4036;
            mo78();
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC2188.f7256, i, 0);
        String string = typedArrayObtainStyledAttributes2.getString(33);
        this.f215 = string == null ? typedArrayObtainStyledAttributes2.getString(7) : string;
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: ۥؗ */
    public final Object mo79(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: ۥۣ */
    public final CharSequence mo80() {
        InterfaceC4132 interfaceC4132 = this.f221;
        if (interfaceC4132 != null) {
            return interfaceC4132.mo5945(this);
        }
        CharSequence charSequenceMo80 = super.mo80();
        String str = this.f215;
        if (str != null) {
            String str2 = String.format(str, "");
            if (!TextUtils.equals(str2, charSequenceMo80)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return str2;
            }
        }
        return charSequenceMo80;
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0186.m435(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
