package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;
import p000.AbstractC2611;
import p000.C0178;
import p000.C1078;
import p000.C4261;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: ۦۗ */
    public static final PorterDuff.Mode f172 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: ۥؗ */
    public byte[] f173;

    /* JADX INFO: renamed from: ۥُ */
    public int f174;

    /* JADX INFO: renamed from: ۥّ */
    public int f175;

    /* JADX INFO: renamed from: ۥۗ */
    public Object f176;

    /* JADX INFO: renamed from: ۥۜ */
    public PorterDuff.Mode f177;

    /* JADX INFO: renamed from: ۥۣ */
    public int f178;

    /* JADX INFO: renamed from: ۦؑ */
    public Parcelable f179;

    /* JADX INFO: renamed from: ۦِ */
    public String f180;

    /* JADX INFO: renamed from: ۦٛ */
    public String f181;

    /* JADX INFO: renamed from: ۦۙ */
    public ColorStateList f182;

    /* JADX INFO: renamed from: ۥۣ */
    public static IconCompat m56(int i) {
        if (i == 0) {
            C1078.m2272("Drawable resource ID must not be 0");
            return null;
        }
        IconCompat iconCompat = new IconCompat();
        iconCompat.f173 = null;
        iconCompat.f179 = null;
        iconCompat.f175 = 0;
        iconCompat.f182 = null;
        iconCompat.f177 = f172;
        iconCompat.f181 = null;
        iconCompat.f178 = 2;
        iconCompat.f174 = i;
        iconCompat.f176 = "";
        iconCompat.f180 = "";
        return iconCompat;
    }

    public final String toString() {
        String str;
        if (this.f178 == -1) {
            return String.valueOf(this.f176);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f178) {
            case 1:
                str = "BITMAP";
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                str = "RESOURCE";
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                str = "DATA";
                break;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                str = "URI";
                break;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                str = "BITMAP_MASKABLE";
                break;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f178) {
            case 1:
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                sb.append(" size=");
                sb.append(((Bitmap) this.f176).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f176).getHeight());
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                sb.append(" pkg=");
                sb.append(this.f180);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(m58())));
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                sb.append(" len=");
                sb.append(this.f174);
                if (this.f175 != 0) {
                    sb.append(" off=");
                    sb.append(this.f175);
                }
                break;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                sb.append(" uri=");
                sb.append(this.f176);
                break;
        }
        if (this.f182 != null) {
            sb.append(" tint=");
            sb.append(this.f182);
        }
        if (this.f177 != f172) {
            sb.append(" mode=");
            sb.append(this.f177);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final Uri m57() {
        int i = this.f178;
        if (i != -1) {
            if (i == 4 || i == 6) {
                return Uri.parse((String) this.f176);
            }
            C0178.m390(this, "called getUri() on ");
            return null;
        }
        Object obj = this.f176;
        if (Build.VERSION.SDK_INT >= 28) {
            return AbstractC2611.m4925(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon uri", e);
            return null;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final int m58() {
        int i = this.f178;
        if (i != -1) {
            if (i == 2) {
                return this.f174;
            }
            C0178.m390(this, "called getResId() on ");
            return 0;
        }
        Object obj = this.f176;
        if (Build.VERSION.SDK_INT >= 28) {
            return AbstractC2611.m4936(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon resource", e);
            return 0;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        }
    }
}
