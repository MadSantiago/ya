package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import p000.AbstractC0383;
import p000.C1078;
import p000.C3514;
import p000.C4261;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC0383 abstractC0383) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f178 = -1;
        iconCompat.f173 = null;
        iconCompat.f179 = null;
        iconCompat.f174 = 0;
        iconCompat.f175 = 0;
        iconCompat.f182 = null;
        iconCompat.f177 = IconCompat.f172;
        iconCompat.f181 = null;
        iconCompat.f178 = !abstractC0383.mo830(1) ? -1 : ((C3514) abstractC0383).f11633.readInt();
        byte[] bArr = iconCompat.f173;
        if (abstractC0383.mo830(2)) {
            Parcel parcel = ((C3514) abstractC0383).f11633;
            int i = parcel.readInt();
            if (i < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f173 = bArr;
        iconCompat.f179 = abstractC0383.m831(iconCompat.f179, 3);
        int i2 = iconCompat.f174;
        if (abstractC0383.mo830(4)) {
            i2 = ((C3514) abstractC0383).f11633.readInt();
        }
        iconCompat.f174 = i2;
        int i3 = iconCompat.f175;
        if (abstractC0383.mo830(5)) {
            i3 = ((C3514) abstractC0383).f11633.readInt();
        }
        iconCompat.f175 = i3;
        iconCompat.f182 = (ColorStateList) abstractC0383.m831(iconCompat.f182, 6);
        String string = iconCompat.f181;
        if (abstractC0383.mo830(7)) {
            string = ((C3514) abstractC0383).f11633.readString();
        }
        iconCompat.f181 = string;
        String string2 = iconCompat.f180;
        if (abstractC0383.mo830(8)) {
            string2 = ((C3514) abstractC0383).f11633.readString();
        }
        iconCompat.f180 = string2;
        iconCompat.f177 = PorterDuff.Mode.valueOf(iconCompat.f181);
        switch (iconCompat.f178) {
            case -1:
                Parcelable parcelable = iconCompat.f179;
                if (parcelable != null) {
                    iconCompat.f176 = parcelable;
                    return iconCompat;
                }
                C1078.m2272("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                Parcelable parcelable2 = iconCompat.f179;
                if (parcelable2 != null) {
                    iconCompat.f176 = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f173;
                iconCompat.f176 = bArr3;
                iconCompat.f178 = 3;
                iconCompat.f174 = 0;
                iconCompat.f175 = bArr3.length;
                return iconCompat;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
            case C4261.LONG_FIELD_NUMBER /* 4 */:
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                String str = new String(iconCompat.f173, Charset.forName("UTF-16"));
                iconCompat.f176 = str;
                if (iconCompat.f178 == 2 && iconCompat.f180 == null) {
                    iconCompat.f180 = str.split(":", -1)[0];
                }
                return iconCompat;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                iconCompat.f176 = iconCompat.f173;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC0383 abstractC0383) {
        abstractC0383.getClass();
        iconCompat.f181 = iconCompat.f177.name();
        switch (iconCompat.f178) {
            case -1:
                iconCompat.f179 = (Parcelable) iconCompat.f176;
                break;
            case 1:
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                iconCompat.f179 = (Parcelable) iconCompat.f176;
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                iconCompat.f173 = ((String) iconCompat.f176).getBytes(Charset.forName("UTF-16"));
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                iconCompat.f173 = (byte[]) iconCompat.f176;
                break;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                iconCompat.f173 = iconCompat.f176.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f178;
        if (-1 != i) {
            abstractC0383.mo833(1);
            ((C3514) abstractC0383).f11633.writeInt(i);
        }
        byte[] bArr = iconCompat.f173;
        if (bArr != null) {
            abstractC0383.mo833(2);
            Parcel parcel = ((C3514) abstractC0383).f11633;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f179;
        if (parcelable != null) {
            abstractC0383.mo833(3);
            ((C3514) abstractC0383).f11633.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.f174;
        if (i2 != 0) {
            abstractC0383.mo833(4);
            ((C3514) abstractC0383).f11633.writeInt(i2);
        }
        int i3 = iconCompat.f175;
        if (i3 != 0) {
            abstractC0383.mo833(5);
            ((C3514) abstractC0383).f11633.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.f182;
        if (colorStateList != null) {
            abstractC0383.mo833(6);
            ((C3514) abstractC0383).f11633.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f181;
        if (str != null) {
            abstractC0383.mo833(7);
            ((C3514) abstractC0383).f11633.writeString(str);
        }
        String str2 = iconCompat.f180;
        if (str2 != null) {
            abstractC0383.mo833(8);
            ((C3514) abstractC0383).f11633.writeString(str2);
        }
    }
}
