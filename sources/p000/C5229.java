package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۦٖۛؔۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5229 implements Parcelable.Creator {

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f17255;

    public /* synthetic */ C5229(int i) {
        this.f17255 = i;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static void m8858(C1477 c1477, Parcel parcel) {
        int i = c1477.f5026;
        int iM7800 = AbstractC4489.m7800(parcel, 20293);
        AbstractC4489.m7797(parcel, 1, 4);
        parcel.writeInt(i);
        AbstractC4489.m7775(parcel, 2, c1477.f5025);
        long j = c1477.f5021;
        AbstractC4489.m7797(parcel, 3, 8);
        parcel.writeLong(j);
        Long l = c1477.f5022;
        if (l != null) {
            AbstractC4489.m7797(parcel, 4, 8);
            parcel.writeLong(l.longValue());
        }
        AbstractC4489.m7775(parcel, 6, c1477.f5020);
        AbstractC4489.m7775(parcel, 7, c1477.f5023);
        Double d = c1477.f5024;
        if (d != null) {
            AbstractC4489.m7797(parcel, 8, 8);
            parcel.writeDouble(d.doubleValue());
        }
        AbstractC4489.m7790(parcel, iM7800);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static void m8859(C2679 c2679, Parcel parcel, int i) {
        String str = c2679.f8889;
        int iM7800 = AbstractC4489.m7800(parcel, 20293);
        AbstractC4489.m7775(parcel, 2, str);
        AbstractC4489.m7793(parcel, 3, c2679.f8888, i);
        AbstractC4489.m7775(parcel, 4, c2679.f8886);
        long j = c2679.f8887;
        AbstractC4489.m7797(parcel, 5, 8);
        parcel.writeLong(j);
        long j2 = c2679.f8885;
        AbstractC4489.m7797(parcel, 6, 8);
        parcel.writeLong(j2);
        AbstractC4489.m7790(parcel, iM7800);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static void m8860(C4990 c4990, Parcel parcel, int i) {
        int iM7800 = AbstractC4489.m7800(parcel, 20293);
        int i2 = c4990.f16515;
        AbstractC4489.m7797(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = c4990.f16514;
        AbstractC4489.m7797(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = c4990.f16505;
        AbstractC4489.m7797(parcel, 3, 4);
        parcel.writeInt(i4);
        AbstractC4489.m7775(parcel, 4, c4990.f16506);
        AbstractC4489.m7802(parcel, 5, c4990.f16504);
        AbstractC4489.m7774(parcel, 6, c4990.f16507, i);
        AbstractC4489.m7784(parcel, 7, c4990.f16512);
        AbstractC4489.m7793(parcel, 8, c4990.f16513, i);
        AbstractC4489.m7774(parcel, 10, c4990.f16509, i);
        AbstractC4489.m7774(parcel, 11, c4990.f16511, i);
        boolean z = c4990.f16508;
        AbstractC4489.m7797(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = c4990.f16503;
        AbstractC4489.m7797(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = c4990.f16502;
        AbstractC4489.m7797(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        AbstractC4489.m7775(parcel, 15, c4990.f16510);
        AbstractC4489.m7790(parcel, iM7800);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        long jM9218 = 0;
        int iM9219 = 0;
        int iM92110 = 0;
        int iM92111 = 0;
        int iM92112 = 0;
        boolean zM9234 = false;
        int iM92113 = 0;
        int iM92114 = 0;
        int iM92115 = 0;
        Bundle bundleM9222 = null;
        ArrayList arrayListM9216 = null;
        String strM9257 = null;
        Bundle bundleM9223 = null;
        ArrayList arrayListM9217 = null;
        String strM9258 = null;
        byte[] bArrM9229 = null;
        String strM9259 = null;
        String strM92510 = null;
        String strM92511 = null;
        switch (this.f17255) {
            case 0:
                int iM9232 = AbstractC5537.m9232(parcel);
                long jM9219 = -1;
                boolean zM9235 = false;
                int iM92116 = 0;
                String strM92512 = null;
                while (parcel.dataPosition() < iM9232) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        strM92512 = AbstractC5537.m9257(parcel, i);
                    } else if (c == 2) {
                        iM92116 = AbstractC5537.m9219(parcel, i);
                    } else if (c == 3) {
                        jM9219 = AbstractC5537.m9218(parcel, i);
                    } else if (c != 4) {
                        AbstractC5537.m9248(parcel, i);
                    } else {
                        zM9235 = AbstractC5537.m9234(parcel, i);
                    }
                }
                AbstractC5537.m9220(parcel, iM9232);
                return new C2274(jM9219, strM92512, zM9235, iM92116);
            case 1:
                int iM9233 = AbstractC5537.m9232(parcel);
                while (parcel.dataPosition() < iM9233) {
                    int i2 = parcel.readInt();
                    if (((char) i2) != 2) {
                        AbstractC5537.m9248(parcel, i2);
                    } else {
                        bundleM9222 = AbstractC5537.m9222(parcel, i2);
                    }
                }
                AbstractC5537.m9220(parcel, iM9233);
                return new C5645(bundleM9222);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                int iM9234 = AbstractC5537.m9232(parcel);
                long jM92110 = 0;
                long jM92111 = 0;
                String strM92513 = null;
                C5645 c5645 = null;
                String strM92514 = null;
                while (parcel.dataPosition() < iM9234) {
                    int i3 = parcel.readInt();
                    char c2 = (char) i3;
                    if (c2 == 2) {
                        strM92513 = AbstractC5537.m9257(parcel, i3);
                    } else if (c2 == 3) {
                        c5645 = (C5645) AbstractC5537.m9236(parcel, i3, C5645.CREATOR);
                    } else if (c2 == 4) {
                        strM92514 = AbstractC5537.m9257(parcel, i3);
                    } else if (c2 == 5) {
                        jM92110 = AbstractC5537.m9218(parcel, i3);
                    } else if (c2 != 6) {
                        AbstractC5537.m9248(parcel, i3);
                    } else {
                        jM92111 = AbstractC5537.m9218(parcel, i3);
                    }
                }
                AbstractC5537.m9220(parcel, iM9234);
                return new C2679(strM92513, c5645, strM92514, jM92110, jM92111);
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                int iM9235 = AbstractC5537.m9232(parcel);
                while (parcel.dataPosition() < iM9235) {
                    int i4 = parcel.readInt();
                    char c3 = (char) i4;
                    if (c3 == 1) {
                        iM9219 = AbstractC5537.m9219(parcel, i4);
                    } else if (c3 != 2) {
                        AbstractC5537.m9248(parcel, i4);
                    } else {
                        strM92511 = AbstractC5537.m9257(parcel, i4);
                    }
                }
                AbstractC5537.m9220(parcel, iM9235);
                return new Scope(iM9219, strM92511);
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                int iM9236 = AbstractC5537.m9232(parcel);
                long jM92112 = 0;
                long jM92113 = 0;
                boolean zM9236 = false;
                Bundle bundleM9224 = null;
                String strM92515 = null;
                while (parcel.dataPosition() < iM9236) {
                    int i5 = parcel.readInt();
                    char c4 = (char) i5;
                    if (c4 == 1) {
                        jM92112 = AbstractC5537.m9218(parcel, i5);
                    } else if (c4 == 2) {
                        jM92113 = AbstractC5537.m9218(parcel, i5);
                    } else if (c4 == 3) {
                        zM9236 = AbstractC5537.m9234(parcel, i5);
                    } else if (c4 == 7) {
                        bundleM9224 = AbstractC5537.m9222(parcel, i5);
                    } else if (c4 != '\b') {
                        AbstractC5537.m9248(parcel, i5);
                    } else {
                        strM92515 = AbstractC5537.m9257(parcel, i5);
                    }
                }
                AbstractC5537.m9220(parcel, iM9236);
                return new C1302(jM92112, jM92113, zM9236, bundleM9224, strM92515);
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                int iM9237 = AbstractC5537.m9232(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < iM9237) {
                    int i6 = parcel.readInt();
                    char c5 = (char) i6;
                    if (c5 == 1) {
                        iM92115 = AbstractC5537.m9219(parcel, i6);
                    } else if (c5 == 2) {
                        strM92510 = AbstractC5537.m9257(parcel, i6);
                    } else if (c5 != 3) {
                        AbstractC5537.m9248(parcel, i6);
                    } else {
                        intent = (Intent) AbstractC5537.m9236(parcel, i6, Intent.CREATOR);
                    }
                }
                AbstractC5537.m9220(parcel, iM9237);
                return new C3156(iM92115, strM92510, intent);
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                int iM9238 = AbstractC5537.m9232(parcel);
                PendingIntent pendingIntent = null;
                C2612 c2612 = null;
                while (parcel.dataPosition() < iM9238) {
                    int i7 = parcel.readInt();
                    char c6 = (char) i7;
                    if (c6 == 1) {
                        iM92114 = AbstractC5537.m9219(parcel, i7);
                    } else if (c6 == 2) {
                        strM9259 = AbstractC5537.m9257(parcel, i7);
                    } else if (c6 == 3) {
                        pendingIntent = (PendingIntent) AbstractC5537.m9236(parcel, i7, PendingIntent.CREATOR);
                    } else if (c6 != 4) {
                        AbstractC5537.m9248(parcel, i7);
                    } else {
                        c2612 = (C2612) AbstractC5537.m9236(parcel, i7, C2612.CREATOR);
                    }
                }
                AbstractC5537.m9220(parcel, iM9238);
                return new Status(iM92114, strM9259, pendingIntent, c2612);
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                int iM9239 = AbstractC5537.m9232(parcel);
                C5692[] c5692Arr = null;
                String[] strArr = null;
                while (parcel.dataPosition() < iM9239) {
                    int i8 = parcel.readInt();
                    char c7 = (char) i8;
                    if (c7 == 2) {
                        iM92113 = AbstractC5537.m9219(parcel, i8);
                    } else if (c7 == 3) {
                        c5692Arr = (C5692[]) AbstractC5537.m9231(parcel, i8, C5692.CREATOR);
                    } else if (c7 != 4) {
                        AbstractC5537.m9248(parcel, i8);
                    } else {
                        int iM9242 = AbstractC5537.m9242(parcel, i8);
                        int iDataPosition = parcel.dataPosition();
                        if (iM9242 == 0) {
                            strArr = null;
                        } else {
                            String[] strArrCreateStringArray = parcel.createStringArray();
                            parcel.setDataPosition(iDataPosition + iM9242);
                            strArr = strArrCreateStringArray;
                        }
                    }
                }
                AbstractC5537.m9220(parcel, iM9239);
                return new C2884(iM92113, c5692Arr, strArr);
            case 8:
                int iM92310 = AbstractC5537.m9232(parcel);
                long jM92114 = 0;
                boolean zM9237 = false;
                String strM92516 = null;
                String strM92517 = null;
                C2884[] c2884Arr = null;
                byte[] bArrM92210 = null;
                while (parcel.dataPosition() < iM92310) {
                    int i9 = parcel.readInt();
                    switch ((char) i9) {
                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                            strM92516 = AbstractC5537.m9257(parcel, i9);
                            break;
                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                            strM92517 = AbstractC5537.m9257(parcel, i9);
                            break;
                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                            c2884Arr = (C2884[]) AbstractC5537.m9231(parcel, i9, C2884.CREATOR);
                            break;
                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                            zM9237 = AbstractC5537.m9234(parcel, i9);
                            break;
                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                            bArrM92210 = AbstractC5537.m9229(parcel, i9);
                            break;
                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                            jM92114 = AbstractC5537.m9218(parcel, i9);
                            break;
                        default:
                            AbstractC5537.m9248(parcel, i9);
                            break;
                    }
                }
                AbstractC5537.m9220(parcel, iM92310);
                return new C4629(strM92516, strM92517, c2884Arr, zM9237, bArrM92210, jM92114);
            case 9:
                int iM92311 = AbstractC5537.m9232(parcel);
                while (parcel.dataPosition() < iM92311) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 2) {
                        AbstractC5537.m9248(parcel, i10);
                    } else {
                        bArrM9229 = AbstractC5537.m9229(parcel, i10);
                    }
                }
                AbstractC5537.m9220(parcel, iM92311);
                return new C3390(bArrM9229);
            case 10:
                int iM92312 = AbstractC5537.m9232(parcel);
                String strM92518 = null;
                byte[] bArrM92211 = null;
                byte[][] bArrM9259 = null;
                byte[][] bArrM92510 = null;
                byte[][] bArrM92511 = null;
                byte[][] bArrM92512 = null;
                int[] iArrM9267 = null;
                byte[][] bArrM92513 = null;
                int[] iArrM9268 = null;
                byte[][] bArrM92514 = null;
                while (parcel.dataPosition() < iM92312) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                            strM92518 = AbstractC5537.m9257(parcel, i11);
                            break;
                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                            bArrM92211 = AbstractC5537.m9229(parcel, i11);
                            break;
                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                            bArrM9259 = AbstractC5537.m9259(parcel, i11);
                            break;
                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                            bArrM92510 = AbstractC5537.m9259(parcel, i11);
                            break;
                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                            bArrM92511 = AbstractC5537.m9259(parcel, i11);
                            break;
                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                            bArrM92512 = AbstractC5537.m9259(parcel, i11);
                            break;
                        case '\b':
                            iArrM9267 = AbstractC5537.m9267(parcel, i11);
                            break;
                        case '\t':
                            bArrM92513 = AbstractC5537.m9259(parcel, i11);
                            break;
                        case '\n':
                            iArrM9268 = AbstractC5537.m9267(parcel, i11);
                            break;
                        case 11:
                            bArrM92514 = AbstractC5537.m9259(parcel, i11);
                            break;
                        default:
                            AbstractC5537.m9248(parcel, i11);
                            break;
                    }
                }
                AbstractC5537.m9220(parcel, iM92312);
                return new C0439(strM92518, bArrM92211, bArrM9259, bArrM92510, bArrM92511, bArrM92512, iArrM9267, bArrM92513, iArrM9268, bArrM92514);
            case 11:
                int iM92313 = AbstractC5537.m9232(parcel);
                double d = 0.0d;
                long jM92115 = 0;
                boolean zM9238 = false;
                int iM92117 = 0;
                int iM92118 = 0;
                int iM92119 = 0;
                String strM92519 = null;
                String strM92520 = null;
                byte[] bArrM92212 = null;
                while (parcel.dataPosition() < iM92313) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                            strM92519 = AbstractC5537.m9257(parcel, i12);
                            break;
                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                            jM92115 = AbstractC5537.m9218(parcel, i12);
                            break;
                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                            zM9238 = AbstractC5537.m9234(parcel, i12);
                            break;
                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                            AbstractC5537.m9273(parcel, i12, 8);
                            d = parcel.readDouble();
                            break;
                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                            strM92520 = AbstractC5537.m9257(parcel, i12);
                            break;
                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                            bArrM92212 = AbstractC5537.m9229(parcel, i12);
                            break;
                        case '\b':
                            iM92117 = AbstractC5537.m9219(parcel, i12);
                            break;
                        case '\t':
                            iM92118 = AbstractC5537.m9219(parcel, i12);
                            break;
                        case '\n':
                            iM92119 = AbstractC5537.m9219(parcel, i12);
                            break;
                        default:
                            AbstractC5537.m9248(parcel, i12);
                            break;
                    }
                }
                AbstractC5537.m9220(parcel, iM92313);
                return new C5692(strM92519, jM92115, zM9238, d, strM92520, bArrM92212, iM92117, iM92118, iM92119);
            case 12:
                int iM92314 = AbstractC5537.m9232(parcel);
                String strM92521 = null;
                C5692 c5692 = null;
                while (parcel.dataPosition() < iM92314) {
                    int i13 = parcel.readInt();
                    char c8 = (char) i13;
                    if (c8 == 2) {
                        strM9258 = AbstractC5537.m9257(parcel, i13);
                    } else if (c8 == 3) {
                        strM92521 = AbstractC5537.m9257(parcel, i13);
                    } else if (c8 == 4) {
                        c5692 = (C5692) AbstractC5537.m9236(parcel, i13, C5692.CREATOR);
                    } else if (c8 != 5) {
                        AbstractC5537.m9248(parcel, i13);
                    } else {
                        zM9234 = AbstractC5537.m9234(parcel, i13);
                    }
                }
                AbstractC5537.m9220(parcel, iM92314);
                return new C1628(strM9258, strM92521, c5692, zM9234);
            case 13:
                int iM92315 = AbstractC5537.m9232(parcel);
                while (parcel.dataPosition() < iM92315) {
                    int i14 = parcel.readInt();
                    if (((char) i14) != 2) {
                        AbstractC5537.m9248(parcel, i14);
                    } else {
                        arrayListM9217 = AbstractC5537.m9216(parcel, i14, C1628.CREATOR);
                    }
                }
                AbstractC5537.m9220(parcel, iM92315);
                return new C5033(arrayListM9217);
            case 14:
                int iM92316 = AbstractC5537.m9232(parcel);
                int iM92120 = 0;
                while (parcel.dataPosition() < iM92316) {
                    int i15 = parcel.readInt();
                    char c9 = (char) i15;
                    if (c9 == 1) {
                        iM92112 = AbstractC5537.m9219(parcel, i15);
                    } else if (c9 != 2) {
                        AbstractC5537.m9248(parcel, i15);
                    } else {
                        iM92120 = AbstractC5537.m9219(parcel, i15);
                    }
                }
                AbstractC5537.m9220(parcel, iM92316);
                return new C4538(iM92112, iM92120);
            case 15:
                int iM92317 = AbstractC5537.m9232(parcel);
                C2274[] c2274Arr = null;
                C2238 c2238 = null;
                while (parcel.dataPosition() < iM92317) {
                    int i16 = parcel.readInt();
                    char c10 = (char) i16;
                    if (c10 == 1) {
                        bundleM9223 = AbstractC5537.m9222(parcel, i16);
                    } else if (c10 == 2) {
                        c2274Arr = (C2274[]) AbstractC5537.m9231(parcel, i16, C2274.CREATOR);
                    } else if (c10 == 3) {
                        iM92111 = AbstractC5537.m9219(parcel, i16);
                    } else if (c10 != 4) {
                        AbstractC5537.m9248(parcel, i16);
                    } else {
                        c2238 = (C2238) AbstractC5537.m9236(parcel, i16, C2238.CREATOR);
                    }
                }
                AbstractC5537.m9220(parcel, iM92317);
                C3202 c3202 = new C3202();
                c3202.f10747 = bundleM9223;
                c3202.f10746 = c2274Arr;
                c3202.f10744 = iM92111;
                c3202.f10745 = c2238;
                return c3202;
            case 16:
                int iM92318 = AbstractC5537.m9232(parcel);
                boolean zM9239 = false;
                boolean zM92310 = false;
                int iM92121 = 0;
                C0144 c0144 = null;
                int[] iArrM9269 = null;
                int[] iArrM92610 = null;
                while (parcel.dataPosition() < iM92318) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 1:
                            c0144 = (C0144) AbstractC5537.m9236(parcel, i17, C0144.CREATOR);
                            break;
                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                            zM9239 = AbstractC5537.m9234(parcel, i17);
                            break;
                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                            zM92310 = AbstractC5537.m9234(parcel, i17);
                            break;
                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                            iArrM9269 = AbstractC5537.m9267(parcel, i17);
                            break;
                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                            iM92121 = AbstractC5537.m9219(parcel, i17);
                            break;
                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                            iArrM92610 = AbstractC5537.m9267(parcel, i17);
                            break;
                        default:
                            AbstractC5537.m9248(parcel, i17);
                            break;
                    }
                }
                AbstractC5537.m9220(parcel, iM92318);
                return new C2238(c0144, zM9239, zM92310, iArrM9269, iM92121, iArrM92610);
            case 17:
                int iM92319 = AbstractC5537.m9232(parcel);
                Bundle bundle = new Bundle();
                Scope[] scopeArr = C4990.f16500;
                C2274[] c2274Arr2 = C4990.f16501;
                C2274[] c2274Arr3 = c2274Arr2;
                int iM92122 = 0;
                int iM92123 = 0;
                int iM92124 = 0;
                boolean zM92311 = false;
                int iM92125 = 0;
                boolean zM92312 = false;
                String strM92522 = null;
                IBinder iBinderM9241 = null;
                Account account = null;
                String strM92523 = null;
                while (parcel.dataPosition() < iM92319) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 1:
                            iM92122 = AbstractC5537.m9219(parcel, i18);
                            break;
                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                            iM92123 = AbstractC5537.m9219(parcel, i18);
                            break;
                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                            iM92124 = AbstractC5537.m9219(parcel, i18);
                            break;
                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                            strM92522 = AbstractC5537.m9257(parcel, i18);
                            break;
                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                            iBinderM9241 = AbstractC5537.m9241(parcel, i18);
                            break;
                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                            scopeArr = (Scope[]) AbstractC5537.m9231(parcel, i18, Scope.CREATOR);
                            break;
                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                            bundle = AbstractC5537.m9222(parcel, i18);
                            break;
                        case '\b':
                            account = (Account) AbstractC5537.m9236(parcel, i18, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            AbstractC5537.m9248(parcel, i18);
                            break;
                        case '\n':
                            c2274Arr2 = (C2274[]) AbstractC5537.m9231(parcel, i18, C2274.CREATOR);
                            break;
                        case 11:
                            c2274Arr3 = (C2274[]) AbstractC5537.m9231(parcel, i18, C2274.CREATOR);
                            break;
                        case '\f':
                            zM92311 = AbstractC5537.m9234(parcel, i18);
                            break;
                        case '\r':
                            iM92125 = AbstractC5537.m9219(parcel, i18);
                            break;
                        case 14:
                            zM92312 = AbstractC5537.m9234(parcel, i18);
                            break;
                        case 15:
                            strM92523 = AbstractC5537.m9257(parcel, i18);
                            break;
                    }
                }
                AbstractC5537.m9220(parcel, iM92319);
                return new C4990(iM92122, iM92123, iM92124, strM92522, iBinderM9241, scopeArr, bundle, account, c2274Arr2, c2274Arr3, zM92311, iM92125, zM92312, strM92523);
            case 18:
                int iM92320 = AbstractC5537.m9232(parcel);
                while (parcel.dataPosition() < iM92320) {
                    int i19 = parcel.readInt();
                    char c11 = (char) i19;
                    if (c11 == 1) {
                        strM9257 = AbstractC5537.m9257(parcel, i19);
                    } else if (c11 == 2) {
                        jM9218 = AbstractC5537.m9218(parcel, i19);
                    } else if (c11 != 3) {
                        AbstractC5537.m9248(parcel, i19);
                    } else {
                        iM92110 = AbstractC5537.m9219(parcel, i19);
                    }
                }
                AbstractC5537.m9220(parcel, iM92320);
                return new C4012(jM9218, strM9257, iM92110);
            case 19:
                int iM92321 = AbstractC5537.m9232(parcel);
                long jM92116 = 0;
                long jM92117 = 0;
                int iM92126 = 0;
                byte[] bArrM92213 = null;
                String strM92524 = null;
                Bundle bundleM9225 = null;
                String strM92525 = null;
                while (parcel.dataPosition() < iM92321) {
                    int i20 = parcel.readInt();
                    switch ((char) i20) {
                        case 1:
                            jM92116 = AbstractC5537.m9218(parcel, i20);
                            break;
                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                            bArrM92213 = AbstractC5537.m9229(parcel, i20);
                            break;
                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                            strM92524 = AbstractC5537.m9257(parcel, i20);
                            break;
                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                            bundleM9225 = AbstractC5537.m9222(parcel, i20);
                            break;
                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                            iM92126 = AbstractC5537.m9219(parcel, i20);
                            break;
                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                            jM92117 = AbstractC5537.m9218(parcel, i20);
                            break;
                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                            strM92525 = AbstractC5537.m9257(parcel, i20);
                            break;
                        default:
                            AbstractC5537.m9248(parcel, i20);
                            break;
                    }
                }
                AbstractC5537.m9220(parcel, iM92321);
                return new C5571(jM92116, bArrM92213, strM92524, bundleM9225, iM92126, jM92117, strM92525);
            case 20:
                int iM92322 = AbstractC5537.m9232(parcel);
                while (true) {
                    ArrayList arrayList = null;
                    while (true) {
                        if (parcel.dataPosition() >= iM92322) {
                            AbstractC5537.m9220(parcel, iM92322);
                            return new C3954(arrayList);
                        }
                        int i21 = parcel.readInt();
                        if (((char) i21) != 1) {
                            AbstractC5537.m9248(parcel, i21);
                        } else {
                            int iM9243 = AbstractC5537.m9242(parcel, i21);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iM9243 == 0) {
                            }
                            ArrayList arrayList2 = new ArrayList();
                            int i22 = parcel.readInt();
                            for (int i23 = 0; i23 < i22; i23++) {
                                arrayList2.add(Integer.valueOf(parcel.readInt()));
                            }
                            parcel.setDataPosition(iDataPosition2 + iM9243);
                            arrayList = arrayList2;
                        }
                        break;
                    }
                }
                break;
            case 21:
                int iM92323 = AbstractC5537.m9232(parcel);
                while (parcel.dataPosition() < iM92323) {
                    int i24 = parcel.readInt();
                    if (((char) i24) != 1) {
                        AbstractC5537.m9248(parcel, i24);
                    } else {
                        arrayListM9216 = AbstractC5537.m9216(parcel, i24, C5571.CREATOR);
                    }
                }
                AbstractC5537.m9220(parcel, iM92323);
                return new C0795(arrayListM9216);
            case 22:
                int iM92324 = AbstractC5537.m9232(parcel);
                long jM92118 = 0;
                int iM92127 = 0;
                String strM92526 = null;
                Long lValueOf = null;
                Float fValueOf = null;
                String strM92527 = null;
                String strM92528 = null;
                Double dValueOf = null;
                while (parcel.dataPosition() < iM92324) {
                    int i25 = parcel.readInt();
                    switch ((char) i25) {
                        case 1:
                            iM92127 = AbstractC5537.m9219(parcel, i25);
                            break;
                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                            strM92526 = AbstractC5537.m9257(parcel, i25);
                            break;
                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                            jM92118 = AbstractC5537.m9218(parcel, i25);
                            break;
                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                            int iM9244 = AbstractC5537.m9242(parcel, i25);
                            if (iM9244 == 0) {
                                lValueOf = null;
                            } else {
                                AbstractC5537.m9271(parcel, iM9244, 8);
                                lValueOf = Long.valueOf(parcel.readLong());
                            }
                            break;
                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                            int iM9245 = AbstractC5537.m9242(parcel, i25);
                            if (iM9245 == 0) {
                                fValueOf = null;
                            } else {
                                AbstractC5537.m9271(parcel, iM9245, 4);
                                fValueOf = Float.valueOf(parcel.readFloat());
                            }
                            break;
                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                            strM92527 = AbstractC5537.m9257(parcel, i25);
                            break;
                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                            strM92528 = AbstractC5537.m9257(parcel, i25);
                            break;
                        case '\b':
                            int iM9246 = AbstractC5537.m9242(parcel, i25);
                            if (iM9246 == 0) {
                                dValueOf = null;
                            } else {
                                AbstractC5537.m9271(parcel, iM9246, 8);
                                dValueOf = Double.valueOf(parcel.readDouble());
                            }
                            break;
                        default:
                            AbstractC5537.m9248(parcel, i25);
                            break;
                    }
                }
                AbstractC5537.m9220(parcel, iM92324);
                return new C1477(iM92127, strM92526, jM92118, lValueOf, fValueOf, strM92527, strM92528, dValueOf);
            case 23:
                int iM92325 = AbstractC5537.m9232(parcel);
                String strM92529 = "";
                String strM92530 = strM92529;
                String strM92531 = strM92530;
                String strM92532 = strM92531;
                int iM92128 = 100;
                long jM92119 = -2147483648L;
                long jM92120 = 0;
                long jM92121 = 0;
                long jM92122 = 0;
                long jM92123 = 0;
                long jM92124 = 0;
                long jM92125 = 0;
                long jM92126 = 0;
                long jM92127 = 0;
                boolean zM92313 = true;
                boolean zM92314 = true;
                boolean zM92315 = false;
                int iM92129 = 0;
                boolean zM92316 = false;
                boolean zM92317 = false;
                int iM92130 = 0;
                int iM92131 = 0;
                String strM92533 = null;
                String strM92534 = null;
                String strM92535 = null;
                String strM92536 = null;
                String strM92537 = null;
                String strM92538 = null;
                Boolean boolValueOf = null;
                ArrayList<String> arrayList3 = null;
                String strM92539 = null;
                String strM92540 = null;
                while (parcel.dataPosition() < iM92325) {
                    int i26 = parcel.readInt();
                    switch ((char) i26) {
                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                            strM92533 = AbstractC5537.m9257(parcel, i26);
                            break;
                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                            strM92534 = AbstractC5537.m9257(parcel, i26);
                            break;
                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                            strM92535 = AbstractC5537.m9257(parcel, i26);
                            break;
                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                            strM92536 = AbstractC5537.m9257(parcel, i26);
                            break;
                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                            jM92120 = AbstractC5537.m9218(parcel, i26);
                            break;
                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                            jM92121 = AbstractC5537.m9218(parcel, i26);
                            break;
                        case '\b':
                            strM92537 = AbstractC5537.m9257(parcel, i26);
                            break;
                        case '\t':
                            zM92313 = AbstractC5537.m9234(parcel, i26);
                            break;
                        case '\n':
                            zM92315 = AbstractC5537.m9234(parcel, i26);
                            break;
                        case 11:
                            jM92119 = AbstractC5537.m9218(parcel, i26);
                            break;
                        case '\f':
                            strM92538 = AbstractC5537.m9257(parcel, i26);
                            break;
                        case '\r':
                        case 17:
                        case 19:
                        case 20:
                        case 24:
                        case '!':
                        default:
                            AbstractC5537.m9248(parcel, i26);
                            break;
                        case 14:
                            jM92122 = AbstractC5537.m9218(parcel, i26);
                            break;
                        case 15:
                            iM92129 = AbstractC5537.m9219(parcel, i26);
                            break;
                        case 16:
                            zM92314 = AbstractC5537.m9234(parcel, i26);
                            break;
                        case 18:
                            zM92316 = AbstractC5537.m9234(parcel, i26);
                            break;
                        case 21:
                            int iM9247 = AbstractC5537.m9242(parcel, i26);
                            if (iM9247 == 0) {
                                boolValueOf = null;
                            } else {
                                AbstractC5537.m9271(parcel, iM9247, 4);
                                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                            }
                            break;
                        case 22:
                            jM92123 = AbstractC5537.m9218(parcel, i26);
                            break;
                        case 23:
                            int iM9248 = AbstractC5537.m9242(parcel, i26);
                            int iDataPosition3 = parcel.dataPosition();
                            if (iM9248 == 0) {
                                arrayList3 = null;
                            } else {
                                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                                parcel.setDataPosition(iDataPosition3 + iM9248);
                                arrayList3 = arrayListCreateStringArrayList;
                            }
                            break;
                        case 25:
                            strM92529 = AbstractC5537.m9257(parcel, i26);
                            break;
                        case 26:
                            strM92530 = AbstractC5537.m9257(parcel, i26);
                            break;
                        case 27:
                            strM92539 = AbstractC5537.m9257(parcel, i26);
                            break;
                        case 28:
                            zM92317 = AbstractC5537.m9234(parcel, i26);
                            break;
                        case 29:
                            jM92124 = AbstractC5537.m9218(parcel, i26);
                            break;
                        case 30:
                            iM92128 = AbstractC5537.m9219(parcel, i26);
                            break;
                        case 31:
                            strM92531 = AbstractC5537.m9257(parcel, i26);
                            break;
                        case ' ':
                            iM92130 = AbstractC5537.m9219(parcel, i26);
                            break;
                        case '\"':
                            jM92125 = AbstractC5537.m9218(parcel, i26);
                            break;
                        case '#':
                            strM92540 = AbstractC5537.m9257(parcel, i26);
                            break;
                        case '$':
                            strM92532 = AbstractC5537.m9257(parcel, i26);
                            break;
                        case '%':
                            jM92126 = AbstractC5537.m9218(parcel, i26);
                            break;
                        case '&':
                            iM92131 = AbstractC5537.m9219(parcel, i26);
                            break;
                        case '\'':
                            jM92127 = AbstractC5537.m9218(parcel, i26);
                            break;
                    }
                }
                AbstractC5537.m9220(parcel, iM92325);
                return new C5855(strM92533, strM92534, strM92535, strM92536, jM92120, jM92121, strM92537, zM92313, zM92315, jM92119, strM92538, jM92122, iM92129, zM92314, zM92316, boolValueOf, jM92123, arrayList3, strM92529, strM92530, strM92539, zM92317, jM92124, iM92128, strM92531, iM92130, jM92125, strM92540, strM92532, jM92126, iM92131, jM92127);
            default:
                int iM92326 = AbstractC5537.m9232(parcel);
                long jM92128 = -1;
                boolean zM92318 = false;
                int iM92132 = 0;
                int iM92133 = 0;
                String strM92541 = null;
                while (parcel.dataPosition() < iM92326) {
                    int i27 = parcel.readInt();
                    char c12 = (char) i27;
                    if (c12 == 1) {
                        zM92318 = AbstractC5537.m9234(parcel, i27);
                    } else if (c12 == 2) {
                        strM92541 = AbstractC5537.m9257(parcel, i27);
                    } else if (c12 == 3) {
                        iM92132 = AbstractC5537.m9219(parcel, i27);
                    } else if (c12 == 4) {
                        iM92133 = AbstractC5537.m9219(parcel, i27);
                    } else if (c12 != 5) {
                        AbstractC5537.m9248(parcel, i27);
                    } else {
                        jM92128 = AbstractC5537.m9218(parcel, i27);
                    }
                }
                AbstractC5537.m9220(parcel, iM92326);
                return new C3434(zM92318, strM92541, iM92132, iM92133, jM92128);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f17255) {
            case 0:
                return new C2274[i];
            case 1:
                return new C5645[i];
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return new C2679[i];
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return new Scope[i];
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                return new C1302[i];
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                return new C3156[i];
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                return new Status[i];
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                return new C2884[i];
            case 8:
                return new C4629[i];
            case 9:
                return new C3390[i];
            case 10:
                return new C0439[i];
            case 11:
                return new C5692[i];
            case 12:
                return new C1628[i];
            case 13:
                return new C5033[i];
            case 14:
                return new C4538[i];
            case 15:
                return new C3202[i];
            case 16:
                return new C2238[i];
            case 17:
                return new C4990[i];
            case 18:
                return new C4012[i];
            case 19:
                return new C5571[i];
            case 20:
                return new C3954[i];
            case 21:
                return new C0795[i];
            case 22:
                return new C1477[i];
            case 23:
                return new C5855[i];
            default:
                return new C3434[i];
        }
    }
}
