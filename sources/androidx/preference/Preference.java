package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import p000.AbstractC0186;
import p000.AbstractC2188;
import p000.InterfaceC4132;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class Preference implements Comparable<Preference> {

    /* JADX INFO: renamed from: ۥَ */
    public final String f217;

    /* JADX INFO: renamed from: ۥْ */
    public final CharSequence f218;

    /* JADX INFO: renamed from: ۥٓ */
    public final CharSequence f219;

    /* JADX INFO: renamed from: ۥٖ */
    public final Object f220;

    /* JADX INFO: renamed from: ۦٗ */
    public InterfaceC4132 f221;

    /* JADX INFO: renamed from: ۦ۟ */
    public final int f222;

    /* JADX INFO: renamed from: ۦۨ */
    public final Context f223;

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this.f222 = Integer.MAX_VALUE;
        this.f223 = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2188.f7256, i, 0);
        typedArrayObtainStyledAttributes.getResourceId(23, typedArrayObtainStyledAttributes.getResourceId(0, 0));
        String string = typedArrayObtainStyledAttributes.getString(26);
        this.f217 = string == null ? typedArrayObtainStyledAttributes.getString(6) : string;
        CharSequence text = typedArrayObtainStyledAttributes.getText(34);
        this.f218 = text == null ? typedArrayObtainStyledAttributes.getText(4) : text;
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(33);
        this.f219 = text2 == null ? typedArrayObtainStyledAttributes.getText(7) : text2;
        this.f222 = typedArrayObtainStyledAttributes.getInt(28, typedArrayObtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        if (typedArrayObtainStyledAttributes.getString(22) == null) {
            typedArrayObtainStyledAttributes.getString(13);
        }
        typedArrayObtainStyledAttributes.getResourceId(27, typedArrayObtainStyledAttributes.getResourceId(3, R.layout.preference));
        typedArrayObtainStyledAttributes.getResourceId(35, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        typedArrayObtainStyledAttributes.getBoolean(21, typedArrayObtainStyledAttributes.getBoolean(2, true));
        boolean z = typedArrayObtainStyledAttributes.getBoolean(30, typedArrayObtainStyledAttributes.getBoolean(5, true));
        typedArrayObtainStyledAttributes.getBoolean(29, typedArrayObtainStyledAttributes.getBoolean(1, true));
        if (typedArrayObtainStyledAttributes.getString(19) == null) {
            typedArrayObtainStyledAttributes.getString(10);
        }
        typedArrayObtainStyledAttributes.getBoolean(16, typedArrayObtainStyledAttributes.getBoolean(16, z));
        typedArrayObtainStyledAttributes.getBoolean(17, typedArrayObtainStyledAttributes.getBoolean(17, z));
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            this.f220 = mo79(typedArrayObtainStyledAttributes, 18);
        } else if (typedArrayObtainStyledAttributes.hasValue(11)) {
            this.f220 = mo79(typedArrayObtainStyledAttributes, 11);
        }
        typedArrayObtainStyledAttributes.getBoolean(31, typedArrayObtainStyledAttributes.getBoolean(12, true));
        if (typedArrayObtainStyledAttributes.hasValue(32)) {
            typedArrayObtainStyledAttributes.getBoolean(32, typedArrayObtainStyledAttributes.getBoolean(14, true));
        }
        typedArrayObtainStyledAttributes.getBoolean(24, typedArrayObtainStyledAttributes.getBoolean(15, false));
        typedArrayObtainStyledAttributes.getBoolean(25, typedArrayObtainStyledAttributes.getBoolean(25, true));
        typedArrayObtainStyledAttributes.getBoolean(20, typedArrayObtainStyledAttributes.getBoolean(20, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i = preference2.f222;
        CharSequence charSequence = preference2.f218;
        int i2 = this.f222;
        if (i2 != i) {
            return i2 - i;
        }
        CharSequence charSequence2 = this.f218;
        if (charSequence2 == charSequence) {
            return 0;
        }
        if (charSequence2 == null) {
            return 1;
        }
        if (charSequence == null) {
            return -1;
        }
        return charSequence2.toString().compareToIgnoreCase(charSequence.toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.f218;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence charSequenceMo80 = mo80();
        if (!TextUtils.isEmpty(charSequenceMo80)) {
            sb.append(charSequenceMo80);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥؗ */
    public Object mo79(TypedArray typedArray, int i) {
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public CharSequence mo80() {
        InterfaceC4132 interfaceC4132 = this.f221;
        return interfaceC4132 != null ? interfaceC4132.mo5945(this) : this.f219;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public void mo78() {
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0186.m435(context, R.attr.preferenceStyle, android.R.attr.preferenceStyle));
    }
}
