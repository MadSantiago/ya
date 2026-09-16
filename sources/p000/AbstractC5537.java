package p000;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.window.BackEvent;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.locks.LockSupport;
import ru.bluecat.yandexmapspatcher.p003ui.MainActivity;

/* JADX INFO: renamed from: ۦٟۢؔۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5537 {

    /* JADX INFO: renamed from: ۦۙ */
    public static int f18287 = 5;

    /* JADX INFO: renamed from: ۥۣ */
    public static final C2484 f18285 = new C2484();

    /* JADX INFO: renamed from: ۥۗ */
    public static final C0857 f18284 = new C0857(-1408707924, new C2654(3), false);

    /* JADX INFO: renamed from: ۥؗ */
    public static final C0857 f18281 = new C0857(-1825785771, new C2654(4), false);

    /* JADX INFO: renamed from: ۦؑ */
    public static final C0857 f18286 = new C0857(1486188148, new C2654(5), false);

    /* JADX INFO: renamed from: ۥُ */
    public static final C4036 f18282 = new C4036(17);

    /* JADX INFO: renamed from: ۥّ */
    public static final C2346 f18283 = new C2346(7, new C4599(27), new C0253(0));

    /* JADX INFO: renamed from: ۥؓ */
    public static final void m9213(InterfaceC2442 interfaceC2442, C4893 c4893) {
        boolean z;
        InterfaceC3212 interfaceC3212M5353 = interfaceC2442.mo3908().m5353();
        C4893 c4894 = (C4893) interfaceC2442.mo3908().f9376;
        InterfaceC3053 interfaceC3053 = c4893.f16122;
        if (c4893.f16113) {
            return;
        }
        c4893.m8233();
        if (!interfaceC3053.mo3539()) {
            try {
                c4893.f16122.mo1204(c4893.f16120, c4893.f16112, c4893, c4893.f16114);
            } catch (Throwable unused) {
            }
        }
        boolean z2 = interfaceC3053.mo1213() > 0.0f;
        if (z2) {
            interfaceC3212M5353.mo2087();
        }
        Canvas canvas = AbstractC5664.f18633;
        C0979 c0979 = (C0979) interfaceC3212M5353;
        Canvas canvas2 = c0979.f3447;
        boolean zIsHardwareAccelerated = canvas2.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            long j = c4893.f16118;
            float f = (int) (j >> 32);
            float f2 = (int) (j & 4294967295L);
            long j2 = c4893.f16128;
            float f3 = ((int) (j2 >> 32)) + f;
            float f4 = f2 + ((int) (j2 & 4294967295L));
            float fMo1208 = interfaceC3053.mo1208();
            C1516 c1516Mo1218 = interfaceC3053.mo1218();
            int iMo1216 = interfaceC3053.mo1216();
            if (fMo1208 < 1.0f || iMo1216 != 3 || c1516Mo1218 != null || interfaceC3053.mo1220() == 1) {
                C0376 c0376M2131 = c4893.f16134;
                if (c0376M2131 == null) {
                    c0376M2131 = AbstractC0993.m2131();
                    c4893.f16134 = c0376M2131;
                }
                c0376M2131.m807(fMo1208);
                c0376M2131.m808(iMo1216);
                c0376M2131.m810(c1516Mo1218);
                canvas2.saveLayer(f, f2, f3, f4, (Paint) c0376M2131.f1400);
            } else {
                canvas2.save();
            }
            canvas2.translate(f, f2);
            canvas2.concat(interfaceC3053.mo1195());
        }
        boolean z3 = !zIsHardwareAccelerated && c4893.f16119;
        if (z3) {
            interfaceC3212M5353.mo2092();
            AbstractC3925 abstractC3925M8234 = c4893.m8234();
            if (abstractC3925M8234 instanceof C2490) {
                InterfaceC3212.m5901(interfaceC3212M5353, ((C2490) abstractC3925M8234).f8283);
            } else if (abstractC3925M8234 instanceof C4996) {
                C0935 c0935M669 = c4893.f16125;
                if (c0935M669 != null) {
                    c0935M669.f3328.rewind();
                } else {
                    c0935M669 = AbstractC0317.m669();
                    c4893.f16125 = c0935M669;
                }
                C0935.m1903(c0935M669, ((C4996) abstractC3925M8234).f16536);
                interfaceC3212M5353.mo2083(c0935M669);
            } else {
                if (!(abstractC3925M8234 instanceof C0889)) {
                    C1078.m2275();
                    return;
                }
                interfaceC3212M5353.mo2083(((C0889) abstractC3925M8234).f3231);
            }
        }
        if (c4894 != null) {
            C4752 c4752 = c4894.f16117;
            if (!c4752.f15687) {
                AbstractC5545.m9276("Only add dependencies during a tracking");
            }
            C3639 c3639 = (C3639) c4752.f15688;
            if (c3639 != null) {
                c3639.m6495(c4893);
            } else if (((C4893) c4752.f15686) != null) {
                C3639 c36310 = AbstractC5705.f18789;
                C3639 c36311 = new C3639();
                c36311.m6495((C4893) c4752.f15686);
                c36311.m6495(c4893);
                c4752.f15688 = c36311;
                c4752.f15686 = null;
            } else {
                c4752.f15686 = c4893;
            }
            C3639 c36312 = (C3639) c4752.f15685;
            if (c36312 != null) {
                z = !c36312.m6497(c4893);
            } else if (((C4893) c4752.f15684) != c4893) {
                z = true;
            } else {
                c4752.f15684 = null;
                z = false;
            }
            if (z) {
                c4893.f16116++;
            }
        }
        if (c0979.f3447.isHardwareAccelerated()) {
            interfaceC3053.mo1196(interfaceC3212M5353);
        } else {
            C2004 c2004 = c4893.f16135;
            if (c2004 == null) {
                c2004 = new C2004();
                c4893.f16135 = c2004;
            }
            C2808 c2808 = c2004.f6603;
            InterfaceC2880 interfaceC2880 = c4893.f16120;
            EnumC2459 enumC2459 = c4893.f16112;
            long jM9235 = m9235(c4893.f16128);
            C2406 c2406 = ((C2004) c2808.f9377).f6604;
            InterfaceC2880 interfaceC2881 = c2406.f8016;
            EnumC2459 enumC24510 = c2406.f8015;
            InterfaceC3212 interfaceC3212M5354 = c2808.m5353();
            long jM5355 = c2808.m5355();
            C4893 c4895 = (C4893) c2808.f9376;
            c2808.m5341(interfaceC2880);
            c2808.m5346(enumC2459);
            c2808.m5356(interfaceC3212M5353);
            c2808.m5351(jM9235);
            c2808.f9376 = c4893;
            interfaceC3212M5353.mo2092();
            try {
                c4893.m8230(c2004);
                interfaceC3212M5353.mo2095();
                c2808.m5341(interfaceC2881);
                c2808.m5346(enumC24510);
                c2808.m5356(interfaceC3212M5354);
                c2808.m5351(jM5355);
                c2808.f9376 = c4895;
            } catch (Throwable th) {
                interfaceC3212M5353.mo2095();
                c2808.m5341(interfaceC2881);
                c2808.m5346(enumC24510);
                c2808.m5356(interfaceC3212M5354);
                c2808.m5351(jM5355);
                c2808.f9376 = c4895;
                throw th;
            }
        }
        if (z3) {
            interfaceC3212M5353.mo2095();
        }
        if (z2) {
            interfaceC3212M5353.mo2097();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvas2.restore();
    }

    /* JADX INFO: renamed from: ۥؔ */
    public static MainActivity m9214() {
        MainActivity mainActivity = MainActivity.f411;
        if (mainActivity != null) {
            return mainActivity;
        }
        new C4441(new long[]{2787766164728096837L, 8126396416895649634L, -3900366249581344504L}).toString();
        return null;
    }

    /* JADX INFO: renamed from: ۥؕ */
    public static InterfaceC0705 m9215(InterfaceC0705 interfaceC0705, boolean z, C2155 c2155, InterfaceC4745 interfaceC4745, int i) {
        if ((i & 4) != 0) {
            c2155 = null;
        }
        return interfaceC0705.mo1571(new C1215(z, null, true, true, c2155, interfaceC4745));
    }

    /* JADX INFO: renamed from: ۥؖ */
    public static ArrayList m9216(Parcel parcel, int i, Parcelable.Creator creator) {
        int iM9242 = m9242(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM9242 == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iM9242);
        return arrayListCreateTypedArrayList;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static C4303 m9217(String str, C3564 c3564, long j, InterfaceC2880 interfaceC2880, InterfaceC4434 interfaceC4434, int i, int i2) {
        C2340 c2340 = C2340.f7777;
        return new C4303(new C5541(str, c3564, c2340, c2340, interfaceC4434, interfaceC2880), i, 1, j);
    }

    /* JADX INFO: renamed from: ۥؙ */
    public static long m9218(Parcel parcel, int i) {
        m9273(parcel, i, 8);
        return parcel.readLong();
    }

    /* JADX INFO: renamed from: ۥؚ */
    public static int m9219(Parcel parcel, int i) {
        m9273(parcel, i, 4);
        return parcel.readInt();
    }

    /* JADX INFO: renamed from: ۥً */
    public static void m9220(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new C3805(AbstractC5078.m8673(i, "Overread allowed size end=", new StringBuilder(String.valueOf(i).length() + 26)), parcel);
        }
    }

    /* JADX INFO: renamed from: ۥٍ */
    public static final void m9221(int i, String str, String str2) {
        throw new IllegalArgumentException("Expected " + str2 + " at index " + i + ", but was '" + str.charAt(i) + '\'');
    }

    /* JADX INFO: renamed from: ۥَ */
    public static Bundle m9222(Parcel parcel, int i) {
        int iM9242 = m9242(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM9242 == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iM9242);
        return bundle;
    }

    /* JADX INFO: renamed from: ۥُ */
    public static void m9223(Throwable th, Throwable th2) {
        if (th != th2) {
            Integer num = AbstractC1505.f5112;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = AbstractC0961.f3405;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    /* JADX INFO: renamed from: ۥِ */
    public static final InterfaceC2043 m9224(InterfaceC3975 interfaceC3975) {
        InterfaceC2043 interfaceC2043 = m9270(interfaceC3975).f2259;
        if (interfaceC2043 != null) {
            return interfaceC2043;
        }
        throw AbstractC3761.m6633("This node does not have an owner.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥّ */
    public static final InterfaceC4933 m9225(AbstractC5381 abstractC5381) {
        if ((abstractC5381.f17781 & 2) != 0) {
            if (abstractC5381 instanceof InterfaceC4933) {
                return (InterfaceC4933) abstractC5381;
            }
            if (abstractC5381 instanceof AbstractC3019) {
                AbstractC5381 abstractC5382 = ((AbstractC3019) abstractC5381).f10167;
                while (abstractC5382 != 0) {
                    if (abstractC5382 instanceof InterfaceC4933) {
                        return (InterfaceC4933) abstractC5382;
                    }
                    abstractC5382 = (!(abstractC5382 instanceof AbstractC3019) || (abstractC5382.f17781 & 2) == 0) ? abstractC5382.f17783 : ((AbstractC3019) abstractC5382).f10167;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥْ */
    public static final InterfaceC0705 m9226(InterfaceC0705 interfaceC0705) {
        return AbstractC4554.m7894(interfaceC0705, 0.0f, null, 520191);
    }

    /* JADX INFO: renamed from: ۥٓ */
    public static boolean m9227(Collection collection, List list, C4229 c4229) {
        if (collection.size() == list.size()) {
            int i = 0;
            for (Object obj : collection) {
                int i2 = i + 1;
                Class cls = (Class) list.get(i);
                Class clsM9264 = m9264(obj, c4229, null);
                Class<AbstractC2198> clsM9037 = AbstractC5378.m9037(AbstractC5041.m8557(AbstractC2198.class));
                if (AbstractC3831.m6874(clsM9264, clsM9037 != null ? clsM9037 : AbstractC2198.class) || AbstractC3831.m6874(cls, clsM9264)) {
                    i = i2;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥٕ */
    public static C5630 m9228(InterfaceC0806 interfaceC0806, C4229 c4229, String str, Object obj, InterfaceC5731 interfaceC5731) {
        return new C5630(interfaceC0806, new C4923(obj, interfaceC5731, c4229, str, 2), 0);
    }

    /* JADX INFO: renamed from: ۥٖ */
    public static byte[] m9229(Parcel parcel, int i) {
        int iM9242 = m9242(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM9242 == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iM9242);
        return bArrCreateByteArray;
    }

    /* JADX INFO: renamed from: ۥ٘ */
    public static final void m9230(C4855 c4855, C0605 c0605) {
        long jMo2808 = ((C2935) c0605.f2256.f8206).mo2808(0L);
        int iRound = Math.round(Float.intBitsToFloat((int) (jMo2808 >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jMo2808 & 4294967295L)));
        c4855.layout(iRound, iRound2, c4855.getMeasuredWidth() + iRound, c4855.getMeasuredHeight() + iRound2);
    }

    /* JADX INFO: renamed from: ۥٙ */
    public static Object[] m9231(Parcel parcel, int i, Parcelable.Creator creator) {
        int iM9242 = m9242(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM9242 == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iM9242);
        return objArrCreateTypedArray;
    }

    /* JADX INFO: renamed from: ۥٚ */
    public static int m9232(Parcel parcel) {
        int i = parcel.readInt();
        int iM9242 = m9242(parcel, i);
        char c = (char) i;
        int iDataPosition = parcel.dataPosition();
        if (c != 20293) {
            throw new C3805("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))), parcel);
        }
        int i2 = iM9242 + iDataPosition;
        if (i2 >= iDataPosition && i2 <= parcel.dataSize()) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i2).length());
        sb.append("Size read is invalid start=");
        sb.append(iDataPosition);
        sb.append(" end=");
        sb.append(i2);
        throw new C3805(sb.toString(), parcel);
    }

    /* JADX INFO: renamed from: ۥٛ */
    public static final AbstractC5381 m9233(C0863 c0863) {
        int i;
        if (c0863 == null || (i = c0863.f3180) == 0) {
            return null;
        }
        return (AbstractC5381) c0863.m1850(i - 1);
    }

    /* JADX INFO: renamed from: ۥٝ */
    public static boolean m9234(Parcel parcel, int i) {
        m9273(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* JADX INFO: renamed from: ۥٞ */
    public static final long m9235(long j) {
        return (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    /* JADX INFO: renamed from: ۥۖ */
    public static Parcelable m9236(Parcel parcel, int i, Parcelable.Creator creator) {
        int iM9242 = m9242(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM9242 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iM9242);
        return parcelable;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static final C1318 m9237(BackEvent backEvent) {
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        return new C1318(backEvent.getSwipeEdge(), backEvent.getProgress(), touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    /* JADX WARN: Code duplicated, block: B:78:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:81:0x0104  */
    /* JADX WARN: Code duplicated, block: B:84:0x010e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0114  */
    /* JADX WARN: Code duplicated, block: B:90:0x0119  */
    /* JADX INFO: renamed from: ۥۘ */
    public static final C3564 m9238(C3564 c3564, EnumC2459 enumC2459) {
        long j;
        C4755 c4755;
        int i;
        int i2;
        C2309 c2309;
        C0553 c0553 = c3564.f11803;
        InterfaceC5561 interfaceC5561 = AbstractC5118.f16970;
        InterfaceC5561 interfaceC5562 = c0553.f1989;
        if (interfaceC5562.equals(C1752.f5825)) {
            interfaceC5562 = AbstractC5118.f16970;
        }
        InterfaceC5561 interfaceC5563 = interfaceC5562;
        long j2 = c0553.f1987;
        C3970[] c3970Arr = C5023.f16621;
        if ((j2 & 1095216660480L) == 0) {
            j2 = AbstractC5118.f16969;
        }
        long j3 = j2;
        C1626 c1626 = c0553.f1984;
        if (c1626 == null) {
            c1626 = C1626.f5439;
        }
        C1626 c1627 = c1626;
        C5827 c5827 = c0553.f1990;
        C5827 c5828 = new C5827(c5827 != null ? c5827.f19197 : 0);
        C2848 c2848 = c0553.f1985;
        C2848 c2849 = new C2848(c2848 != null ? c2848.f9512 : 65535);
        AbstractC0903 abstractC0903 = c0553.f1986;
        if (abstractC0903 == null) {
            abstractC0903 = AbstractC0903.f3247;
        }
        AbstractC0903 abstractC0904 = abstractC0903;
        String str = c0553.f1996;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j4 = c0553.f1988;
        if ((j4 & 1095216660480L) == 0) {
            j4 = AbstractC5118.f16968;
        }
        long j5 = j4;
        C3917 c3917 = c0553.f1994;
        float f = c3917 != null ? c3917.f13058 : 0.0f;
        C3917 c3918 = new C3917(Float.isNaN(f) ? 0.0f : f);
        C5647 c5647 = c0553.f1993;
        if (c5647 == null) {
            c5647 = C5647.f18598;
        }
        C5647 c5648 = c5647;
        C5668 c5668M5360 = c0553.f1995;
        if (c5668M5360 == null) {
            C5668 c5668 = C5668.f18644;
            c5668M5360 = AbstractC4835.f15923.m5360();
        }
        C5668 c5669 = c5668M5360;
        long j6 = c0553.f1991;
        if (j6 == 16) {
            j6 = AbstractC5118.f16967;
        }
        long j7 = j6;
        C1690 c1690 = c0553.f1992;
        if (c1690 == null) {
            c1690 = C1690.f5635;
        }
        C1690 c1691 = c1690;
        C5906 c5906 = c0553.f1997;
        if (c5906 == null) {
            c5906 = C5906.f19486;
        }
        C5906 c5907 = c5906;
        C2393 c2393 = c0553.f1999;
        AbstractC0213 abstractC0213 = c0553.f1998;
        if (abstractC0213 == null) {
            abstractC0213 = C1548.f5235;
        }
        C0553 c0554 = new C0553(interfaceC5563, j3, c1627, c5828, c2849, abstractC0904, str2, j5, c3918, c5648, c5669, j7, c1691, c5907, c2393, abstractC0213);
        C0477 c0477 = c3564.f11802;
        int i3 = AbstractC4594.f15164;
        int i4 = c0477.f1736;
        int i5 = 5;
        if (i4 == 0) {
            i4 = 5;
        }
        int i6 = c0477.f1734;
        if (i6 != 3) {
            if (i6 == 0) {
                int iOrdinal = enumC2459.ordinal();
                if (iOrdinal == 0) {
                    i6 = 1;
                } else {
                    if (iOrdinal != 1) {
                        C1078.m2275();
                        return null;
                    }
                    i5 = 2;
                }
            }
            j = c0477.f1731;
            if ((j & 1095216660480L) == 0) {
                j = AbstractC4594.f15165;
            }
            c4755 = c0477.f1737;
            if (c4755 == null) {
                c4755 = C4755.f15694;
            }
            C0823 c0823 = c0477.f1732;
            C1220 c1220 = c0477.f1733;
            i = c0477.f1739;
            if (i == 0) {
                i = C2591.f8653;
            }
            i2 = c0477.f1735;
            if (i2 == 0) {
                i2 = 1;
            }
            c2309 = c0477.f1738;
            if (c2309 == null) {
                c2309 = C2309.f7644;
            }
            return new C3564(c0554, new C0477(i4, i6, j, c4755, c0823, c1220, i, i2, c2309), c3564.f11801);
        }
        int iOrdinal2 = enumC2459.ordinal();
        if (iOrdinal2 == 0) {
            i5 = 4;
        } else if (iOrdinal2 != 1) {
            C1078.m2275();
            return null;
        }
        i6 = i5;
        j = c0477.f1731;
        if ((j & 1095216660480L) == 0) {
            j = AbstractC4594.f15165;
        }
        c4755 = c0477.f1737;
        if (c4755 == null) {
            c4755 = C4755.f15694;
        }
        C0823 c0824 = c0477.f1732;
        C1220 c1221 = c0477.f1733;
        i = c0477.f1739;
        if (i == 0) {
            i = C2591.f8653;
        }
        i2 = c0477.f1735;
        if (i2 == 0) {
            i2 = 1;
        }
        c2309 = c0477.f1738;
        if (c2309 == null) {
            c2309 = C2309.f7644;
        }
        return new C3564(c0554, new C0477(i4, i6, j, c4755, c0824, c1221, i, i2, c2309), c3564.f11801);
    }

    /* JADX INFO: renamed from: ۥۙ */
    public static final InterfaceC0705 m9239(InterfaceC0705 interfaceC0705, boolean z, C2243 c2243) {
        return interfaceC0705.mo1571(z ? new C4309(c2243) : C4217.f13994);
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static final int m9240(String str) {
        long j = 0;
        for (int i = 0; i < str.length(); i++) {
            j += ((long) str.charAt(i)) > 127 ? 2L : 1L;
        }
        return (int) j;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static IBinder m9241(Parcel parcel, int i) {
        int iM9242 = m9242(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM9242 == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iM9242);
        return strongBinder;
    }

    /* JADX INFO: renamed from: ۥۡ */
    public static int m9242(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    /* JADX INFO: renamed from: ۥۢ */
    public static final Object m9243(InterfaceC3534 interfaceC3534, InterfaceC5731 interfaceC5731) throws Throwable {
        AbstractC5596 abstractC5596M7538;
        InterfaceC3534 interfaceC3534M5208;
        long jM9445;
        InterfaceC2218 interfaceC2218 = C0373.f1369;
        AbstractC2132 abstractC2132 = (AbstractC2132) interfaceC3534.mo865(interfaceC2218);
        C4794 c4794 = C4794.f15814;
        if (abstractC2132 == null) {
            abstractC5596M7538 = AbstractC4253.m7538();
            interfaceC3534M5208 = AbstractC2774.m5208(c4794, interfaceC3534.mo860(abstractC5596M7538), true);
            C0649 c0649 = AbstractC0912.f3276;
            if (interfaceC3534M5208 != c0649 && interfaceC3534M5208.mo865(interfaceC2218) == null) {
                interfaceC3534M5208 = interfaceC3534M5208.mo860(c0649);
            }
        } else {
            abstractC5596M7538 = (AbstractC5596) AbstractC4253.f14094.get();
            interfaceC3534M5208 = AbstractC2774.m5208(c4794, interfaceC3534, true);
            C0649 c06410 = AbstractC0912.f3276;
            if (interfaceC3534M5208 != c06410 && interfaceC3534M5208.mo865(interfaceC2218) == null) {
                interfaceC3534M5208 = interfaceC3534M5208.mo860(c06410);
            }
        }
        C0702 c0702 = new C0702(interfaceC3534M5208, Thread.currentThread(), abstractC5596M7538);
        c0702.m3707(1, c0702, interfaceC5731);
        AbstractC5596 abstractC5596 = c0702.f2546;
        if (abstractC5596 != null) {
            abstractC5596.m9441(false);
        }
        while (true) {
            if (abstractC5596 != null) {
                try {
                    jM9445 = abstractC5596.m9445();
                } catch (Throwable th) {
                    if (abstractC5596 != null) {
                        abstractC5596.m9442(false);
                    }
                    throw th;
                }
            } else {
                jM9445 = Long.MAX_VALUE;
            }
            if (!(c0702.m890() instanceof InterfaceC0465)) {
                break;
            }
            LockSupport.parkNanos(c0702, jM9445);
            if (Thread.interrupted()) {
                c0702.m858(new InterruptedException());
            }
        }
        if (abstractC5596 != null) {
            abstractC5596.m9442(false);
        }
        Object objM9033 = AbstractC5378.m9033(c0702.m890());
        C5036 c5036 = objM9033 instanceof C5036 ? (C5036) objM9033 : null;
        if (c5036 == null) {
            return objM9033;
        }
        throw c5036.f16702;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final C4291 m9244(String str) {
        return new C4291(Collections.singleton(str));
    }

    /* JADX INFO: renamed from: ۥۥ */
    public static final AbstractC1311 m9245(InterfaceC3975 interfaceC3975, int i) {
        AbstractC1311 abstractC1311 = ((AbstractC5381) interfaceC3975).f17791.f17789;
        return (abstractC1311.mo2787() == interfaceC3975 && AbstractC5490.m9196(i)) ? abstractC1311.f4530 : abstractC1311;
    }

    /* JADX INFO: renamed from: ۥۧ */
    public static void m9246(Serializable serializable) {
        if (f18287 > 0) {
            Log.e("RootBeer", m9272().concat(String.valueOf(serializable)));
            Log.e("QLog", m9272().concat(String.valueOf(serializable)));
        }
    }

    /* JADX INFO: renamed from: ۥۨ */
    public static final AbstractC1311 m9247(InterfaceC3975 interfaceC3975) {
        if (!((AbstractC5381) interfaceC3975).f17791.f17786) {
            AbstractC3480.m6278("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        AbstractC1311 abstractC1311M9245 = m9245(interfaceC3975, 2);
        abstractC1311M9245.getClass();
        if (!abstractC1311M9245.mo2787().f17786) {
            AbstractC3480.m6278("LayoutCoordinates is not attached.");
        }
        return abstractC1311M9245;
    }

    /* JADX INFO: renamed from: ۦ */
    public static void m9248(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m9242(parcel, i));
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static final void m9249(C0863 c0863, AbstractC5381 abstractC5381) {
        C0863 c0863M1329 = m9270(abstractC5381).m1329();
        int i = c0863M1329.f3180 - 1;
        Object[] objArr = c0863M1329.f3182;
        if (i < objArr.length) {
            while (i >= 0) {
                c0863.m1843((AbstractC5381) ((C0605) objArr[i]).f2256.f8210);
                i--;
            }
        }
    }

    /* JADX INFO: renamed from: ۦؓ */
    public static final InterfaceC0705 m9250(EnumC2887 enumC2887, C0599 c0599, boolean z, C2155 c2155, InterfaceC4448 interfaceC4448) {
        if (c0599 != null) {
            return new C1715(enumC2887, null, c0599, z, c2155, interfaceC4448);
        }
        if (c0599 == null) {
            return new C1715(enumC2887, null, null, z, c2155, interfaceC4448);
        }
        return AbstractC0993.m2152(C4217.f13994, new C2634(c0599, enumC2887, z, c2155, interfaceC4448));
    }

    /* JADX INFO: renamed from: ۦؔ */
    public static List m9251(AbstractC2724 abstractC2724, C4229 c4229, Class cls, InterfaceC4745 interfaceC4745) throws NoSuchFieldException, NoSuchMethodException {
        List listM9251 = C2340.f7777;
        if (cls != null) {
            Class<Object> clsM9037 = AbstractC5378.m9037(AbstractC5041.m8557(Object.class));
            if (!cls.equals(clsM9037 != null ? clsM9037 : Object.class)) {
                Collection collection = (Collection) interfaceC4745.mo211(cls);
                if (collection.isEmpty()) {
                    if (c4229.f14031) {
                        listM9251 = m9251(abstractC2724, c4229, cls.getSuperclass(), interfaceC4745);
                    } else {
                        m9263(abstractC2724, c4229);
                    }
                    collection = listM9251;
                }
                return (List) collection;
            }
        }
        m9263(abstractC2724, c4229);
        return listM9251;
    }

    /* JADX INFO: renamed from: ۦؗ */
    public static C3998 m9252() {
        C3998 c3998 = MainActivity.f412;
        if (c3998 != null) {
            return c3998;
        }
        new C4441(new long[]{6876990786930532655L, 3393058612798378241L, 7794532764091845055L}).toString();
        return null;
    }

    /* JADX INFO: renamed from: ۦؙ */
    public static final void m9253(long j, byte[] bArr, int i, int i2, int i3) {
        int i4 = 7 - i2;
        int i5 = 8 - i3;
        if (i5 > i4) {
            return;
        }
        while (true) {
            int i6 = AbstractC0819.f2911[(int) ((j >> (i4 << 3)) & 255)];
            int i7 = i + 1;
            bArr[i] = (byte) (i6 >> 8);
            i += 2;
            bArr[i7] = (byte) i6;
            if (i4 == i5) {
                return;
            } else {
                i4--;
            }
        }
    }

    /* JADX INFO: renamed from: ۦَ */
    public static /* synthetic */ boolean m9254(int i, AbstractC0897 abstractC0897, StringBuilder sb) {
        if (i - 1 != 0 || abstractC0897 == AbstractC0897.f3239) {
            return false;
        }
        sb.append(abstractC0897.mo1508());
        sb.append('.');
        sb.append(abstractC0897.mo1507());
        sb.append(':');
        sb.append(abstractC0897.mo1505());
        return true;
    }

    /* JADX INFO: renamed from: ۦُ */
    public static final Object m9255(InterfaceC1827 interfaceC1827) {
        Object objMo570 = interfaceC1827.mo570();
        C3363 c3363 = objMo570 instanceof C3363 ? (C3363) objMo570 : null;
        if (c3363 != null) {
            return c3363.f11239;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦِ */
    public static final C2934 m9256(View view) {
        InterfaceC4861 interfaceC4861;
        Context context = view.getContext();
        Context baseContext = context;
        while (true) {
            if (baseContext instanceof ContextWrapper) {
                if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService) || (baseContext instanceof Application)) {
                    break;
                }
                ContextWrapper contextWrapper = (ContextWrapper) baseContext;
                if (contextWrapper.getBaseContext() != null) {
                    baseContext = contextWrapper.getBaseContext();
                }
            }
            baseContext = null;
            break;
        }
        if (baseContext == null) {
            Configuration configuration = context.getResources().getConfiguration();
            C0505 c0505M7168 = AbstractC4009.m7168(context);
            long jM9370 = AbstractC5568.m9370(configuration.screenWidthDp, configuration.screenHeightDp);
            long jMo747 = c0505M7168.mo747(jM9370);
            return new C2934((((long) ((int) Float.intBitsToFloat((int) (jMo747 & 4294967295L)))) & 4294967295L) | (((long) ((int) Float.intBitsToFloat((int) (jMo747 >> 32)))) << 32), jM9370);
        }
        InterfaceC4840.f15945.getClass();
        C2604 c2604 = C0218.f820;
        ContextWrapper contextWrapper2 = (ContextWrapper) baseContext;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            interfaceC4861 = C1678.f5591;
        } else {
            interfaceC4861 = i >= 30 ? C2402.f8006 : C1397.f4801;
        }
        C2546 c2546Mo2963 = interfaceC4861.mo2963(contextWrapper2, c2604.f8696);
        long jHeight = (4294967295L & ((long) c2546Mo2963.m4790().height())) | (((long) c2546Mo2963.m4790().width()) << 32);
        return new C2934(jHeight, AbstractC4009.m7168(baseContext).mo752(m9235(jHeight)));
    }

    /* JADX INFO: renamed from: ۦٕ */
    public static String m9257(Parcel parcel, int i) {
        int iM9242 = m9242(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM9242 == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iM9242);
        return string;
    }

    /* JADX INFO: renamed from: ۦٖ */
    public static final long m9258(int i, byte[] bArr) {
        return (((long) bArr[i + 7]) & 255) | ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
    }

    /* JADX INFO: renamed from: ۦٗ */
    public static byte[][] m9259(Parcel parcel, int i) {
        int iM9242 = m9242(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM9242 == 0) {
            return null;
        }
        int i2 = parcel.readInt();
        byte[][] bArr = new byte[i2][];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = parcel.createByteArray();
        }
        parcel.setDataPosition(iDataPosition + iM9242);
        return bArr;
    }

    /* JADX INFO: renamed from: ۦٚ */
    public static String m9260(String str) {
        StringBuilder sb = new StringBuilder("'");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\'') {
                sb.append("'\\''");
            } else {
                sb.append(cCharAt);
            }
        }
        sb.append('\'');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static final String m9261(int i, String str) {
        int iM9240 = i - m9240(str);
        return iM9240 > 0 ? AbstractC3761.m6628(str, AbstractC4981.m8363(iM9240, " ")) : str;
    }

    /* JADX INFO: renamed from: ۦٝ */
    public static final int m9262(int i, int i2) {
        if (i == Integer.MAX_VALUE) {
            return i;
        }
        int i3 = i - i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0250  */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:82:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:85:0x0212  */
    /* JADX WARN: Code duplicated, block: B:87:0x0216  */
    /* JADX WARN: Code duplicated, block: B:89:0x021a  */
    /* JADX WARN: Code duplicated, block: B:91:0x021e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0228  */
    /* JADX WARN: Code duplicated, block: B:94:0x0232  */
    /* JADX WARN: Code duplicated, block: B:96:0x0235  */
    /* JADX WARN: Code duplicated, block: B:98:0x0249  */
    /* JADX WARN: Instruction removed from duplicated block: B:79:0x01d4, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:82:0x01f3, please report this as an issue */
    /* JADX INFO: renamed from: ۦٞ */
    public static void m9263(AbstractC2724 abstractC2724, C4229 c4229) throws NoSuchFieldException, NoSuchMethodException {
        int i;
        Object c4535;
        String strConcat;
        String str;
        boolean z;
        String str2;
        int i2;
        String string;
        String strM4262;
        String strM8362;
        boolean z2 = c4229.f14031;
        Class cls = c4229.f14030;
        String str3 = z2 ? " (Also tried for superclass)" : "";
        String str4 = !z2 ? "Members in superclass are not reflected in the current class, you can try adding superclass() in your condition and try again. " : "Check if the conditions are correct and valid, and try again. ";
        try {
            Map mapMo4294 = abstractC2724.mo4294();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : mapMo4294.entrySet()) {
                try {
                    String str5 = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value == null) {
                        strM4262 = null;
                        i = 3;
                    } else {
                        i = 3;
                        strM4262 = value instanceof InterfaceC0400 ? "(Runtime Condition)" : ((value instanceof Collection) && ((Collection) value).isEmpty()) ? null : AbstractC2198.m4262(value);
                    }
                    if (strM4262 != null) {
                        try {
                            strM8362 = AbstractC4981.m8362(strM4262.toString(), " (Kotlin reflection is not available)", "");
                        } catch (Throwable th) {
                            th = th;
                            c4535 = new C4535(th);
                            strConcat = AbstractC4981.m8362(cls.toString(), " (Kotlin reflection is not available)", "").concat("\nFailed to build condition table.");
                            if (c4535 instanceof C4535) {
                                c4535 = strConcat;
                            }
                            str = (String) c4535;
                            z = abstractC2724 instanceof C2244;
                            if (z) {
                                str2 = "No method found matching the condition for current class" + str3 + ".\n" + str + "\nSuggestion: " + str4;
                            } else {
                                if (abstractC2724 instanceof C2749) {
                                    C5028.m8449(abstractC2724, "Unsupported condition type: ");
                                    return;
                                }
                                str2 = "No field found matching the condition for current class" + str3 + ".\n" + str + "\nSuggestion: " + str4;
                            }
                            i2 = c4229.f14028;
                            if (i2 == 1) {
                                if (!z) {
                                    throw new NoSuchMethodException(str2.concat("\nIf you want to ignore this exception, adding optional() in your condition.\n\n====== Generated by KavaRef 1.1.0 ======\n"));
                                }
                                if (!(abstractC2724 instanceof C2749)) {
                                    throw new NoSuchFieldException(str2.concat("\nIf you want to ignore this exception, adding optional() in your condition.\n\n====== Generated by KavaRef 1.1.0 ======\n"));
                                }
                                C5028.m8449(abstractC2724, "Unsupported condition type: ");
                                return;
                            }
                            if (i2 == 2) {
                                string = AbstractC0684.m9760(str2).toString();
                                if (AbstractC3761.m6632(AbstractC4009.f13362) <= AbstractC3761.m6632(i)) {
                                    AbstractC4009.f13365.mo7234(string, null);
                                }
                            }
                        }
                    } else {
                        strM8362 = null;
                    }
                    C3869 c3869 = strM8362 != null ? new C3869(str5, strM8362) : null;
                    if (c3869 != null) {
                        arrayList.add(c3869);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    i = 3;
                }
            }
            i = 3;
            if (arrayList.isEmpty()) {
                c4535 = cls.toString();
                cls = cls;
            } else {
                Iterator it = arrayList.iterator();
                try {
                    if (!it.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    final int iM9240 = m9240((String) ((C3869) it.next()).f12915);
                    while (it.hasNext()) {
                        int iM9241 = m9240((String) ((C3869) it.next()).f12915);
                        if (iM9240 < iM9241) {
                            iM9240 = iM9241;
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    if (!it2.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    int iM9242 = m9240((String) ((C3869) it2.next()).f12914);
                    while (it2.hasNext()) {
                        int iM9243 = m9240((String) ((C3869) it2.next()).f12914);
                        if (iM9242 < iM9243) {
                            iM9242 = iM9243;
                        }
                    }
                    String strM8363 = AbstractC4981.m8362(cls.toString(), " (Kotlin reflection is not available)", "");
                    int iM9244 = m9240(strM8363) - ((iM9240 + iM9242) + 3);
                    if (iM9244 < 0) {
                        iM9244 = 0;
                    }
                    final int i3 = iM9242 + iM9244;
                    cls = cls;
                    String str6 = "+-" + AbstractC4981.m8363(iM9240, "-") + "-+-" + AbstractC4981.m8363(i3, "-") + "-+";
                    int i4 = iM9240 + i3 + 3;
                    c4535 = AbstractC0973.m2056(AbstractC2164.m4188("+-" + AbstractC4981.m8363(i4, "-") + "-+", "| " + m9261(i4, strM8363) + " |", str6, AbstractC0973.m2056(arrayList, "\n", null, null, new InterfaceC4745() { // from class: ۥِّؑٛ
                        @Override // p000.InterfaceC4745
                        /* JADX INFO: renamed from: ۦؚ */
                        public final Object mo211(Object obj) {
                            C3869 c38610 = (C3869) obj;
                            String str7 = (String) c38610.f12915;
                            String str8 = (String) c38610.f12914;
                            return "| " + AbstractC5537.m9261(iM9240, str7) + " | " + AbstractC5537.m9261(i3, str8) + " |";
                        }
                    }, 30), str6), "\n", null, null, null, 62);
                } catch (Throwable th3) {
                    th = th3;
                    c4535 = new C4535(th);
                }
            }
        } catch (Throwable th4) {
            th = th4;
            i = 3;
        }
        strConcat = AbstractC4981.m8362(cls.toString(), " (Kotlin reflection is not available)", "").concat("\nFailed to build condition table.");
        if (c4535 instanceof C4535) {
            c4535 = strConcat;
        }
        str = (String) c4535;
        z = abstractC2724 instanceof C2244;
        if (z) {
            str2 = "No method found matching the condition for current class" + str3 + ".\n" + str + "\nSuggestion: " + str4;
        } else {
            if (abstractC2724 instanceof C2749) {
                C5028.m8449(abstractC2724, "Unsupported condition type: ");
                return;
            }
            str2 = "No field found matching the condition for current class" + str3 + ".\n" + str + "\nSuggestion: " + str4;
        }
        i2 = c4229.f14028;
        if (i2 == 1) {
            if (!z) {
                throw new NoSuchMethodException(str2.concat("\nIf you want to ignore this exception, adding optional() in your condition.\n\n====== Generated by KavaRef 1.1.0 ======\n"));
            }
            if (!(abstractC2724 instanceof C2749)) {
                throw new NoSuchFieldException(str2.concat("\nIf you want to ignore this exception, adding optional() in your condition.\n\n====== Generated by KavaRef 1.1.0 ======\n"));
            }
            C5028.m8449(abstractC2724, "Unsupported condition type: ");
            return;
        }
        if (i2 == 2) {
            string = AbstractC0684.m9760(str2).toString();
            if (AbstractC3761.m6632(AbstractC4009.f13362) <= AbstractC3761.m6632(i)) {
                AbstractC4009.f13365.mo7234(string, null);
            }
        }
    }

    /* JADX INFO: renamed from: ۦٟ */
    public static Class m9264(Object obj, C4229 c4229, String str) {
        Class<?> clsM4531;
        if (obj instanceof Class) {
            clsM4531 = (Class) obj;
        } else if (obj instanceof C3131) {
            clsM4531 = ((C3131) obj).f10543;
        } else if (obj instanceof String) {
            int i = c4229.f14028;
            Class cls = c4229.f14030;
            if (i == 1) {
                clsM4531 = AbstractC2405.m4530(cls.getClassLoader(), (String) obj);
            } else {
                clsM4531 = AbstractC2405.m4531((String) obj, cls.getClassLoader(), 2);
                if (clsM4531 == null) {
                    clsM4531 = AbstractC2164.class;
                    Class<?> clsM9037 = AbstractC5378.m9037(AbstractC5041.m8557(clsM4531));
                    if (clsM9037 != null) {
                        clsM4531 = clsM9037;
                    }
                }
            }
        } else {
            if (!(obj instanceof AbstractC2198)) {
                C1078.m2270(obj, ", supported types are Class, KClass, String and VagueType.", "Unsupported type: ");
                return null;
            }
            clsM4531 = obj.getClass();
        }
        Class<AbstractC2198> clsM9038 = AbstractC5378.m9037(AbstractC5041.m8557(AbstractC2198.class));
        if (!AbstractC3831.m6874(clsM4531, clsM9038 != null ? clsM9038 : AbstractC2198.class) || str == null) {
            return clsM4531;
        }
        C1078.m2270(str, "\".", "VagueType is not supported for \"");
        return null;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static C5630 m9265(C3527 c3527, AbstractC2724 abstractC2724, C4229 c4229) {
        int i = 8;
        int i2 = 9;
        return m9228(m9228(m9228(m9228(m9228(m9228(m9228(m9228(m9228(m9228(new C5630(c3527, new C4618(20), 1), c4229, "name", abstractC2724.f9027, new C4599(7)), c4229, "nameCondition", null, new C4599(i)), c4229, "modifiers", abstractC2724.f9024, new C4599(i2)), c4229, "modifiersNot", abstractC2724.f9029, new C4599(10)), c4229, "modifiersCondition", null, new C4599(11)), c4229, "isSynthetic", null, new C4599(12)), c4229, "isSyntheticNot", null, new C4599(14)), c4229, "annotations", abstractC2724.f9025, new C2778(c4229, i)), c4229, "annotationsNot", abstractC2724.f9026, new C2778(c4229, i2)), c4229, "genericString", null, new C4599(15));
    }

    /* JADX INFO: renamed from: ۦۚ */
    public static C3657 m9266(String str) {
        C3657 c3657 = null;
        String str2 = "com.highcapable.yukihookapi.hook.xposed.bridge.status.YukiXposedModuleStatus_Impl_Impl_ru_bluecat_yandexmapspatcher" instanceof C4535 ? null : "com.highcapable.yukihookapi.hook.xposed.bridge.status.YukiXposedModuleStatus_Impl_Impl_ru_bluecat_yandexmapspatcher";
        if (str2 == null) {
            str2 = "";
        }
        Class clsM4531 = AbstractC2405.m4531(str2, null, 3);
        if (clsM4531 != null) {
            C4229 c4229 = new C4229(clsM4531, null, 1);
            c4229.f14028 = 3;
            C2244 c2244 = new C2244();
            c2244.f9028 = c4229;
            c2244.f9027 = str;
            c3657 = (C3657) AbstractC0973.m2058(c2244.m4293());
        }
        if (c3657 == null) {
            ArrayList arrayList = C2503.f8322;
            C2503.m4652("Failed to initialize YukiXposedModuleStatus");
        }
        return c3657;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public static int[] m9267(Parcel parcel, int i) {
        int iM9242 = m9242(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM9242 == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iM9242);
        return iArrCreateIntArray;
    }

    /* JADX INFO: renamed from: ۦۜ */
    public static final String m9268(int i, C5362 c5362) {
        c5362.m8997(AbstractC4354.f14356);
        return ((Context) c5362.m8997(AbstractC4354.f14355)).getResources().getString(i);
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public static final InterfaceC0705 m9269(InterfaceC0705 interfaceC0705, InterfaceC2864 interfaceC2864) {
        return AbstractC4554.m7894(interfaceC0705, 0.0f, interfaceC2864, 518143);
    }

    /* JADX INFO: renamed from: ۦ۠ */
    public static final C0605 m9270(InterfaceC3975 interfaceC3975) {
        AbstractC1311 abstractC1311 = ((AbstractC5381) interfaceC3975).f17791.f17789;
        if (abstractC1311 != null) {
            return abstractC1311.f4513;
        }
        throw AbstractC3761.m6633("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    /* JADX INFO: renamed from: ۦۢ */
    public static void m9271(Parcel parcel, int i, int i2) {
        if (i == i2) {
            return;
        }
        String hexString = Integer.toHexString(i);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(i).length() + 4 + 1);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(i);
        throw new C3805(AbstractC3761.m6622(sb, " (0x", hexString, ")"), parcel);
    }

    /* JADX INFO: renamed from: ۦۣ */
    public static String m9272() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String methodName = stackTrace[2].getMethodName();
        String className = stackTrace[2].getClassName();
        return className.substring(className.lastIndexOf(46) + 1) + ": " + methodName + "() [" + stackTrace[2].getLineNumber() + "] - ";
    }

    /* JADX INFO: renamed from: ۦۤ */
    public static void m9273(Parcel parcel, int i, int i2) {
        int iM9242 = m9242(parcel, i);
        if (iM9242 == i2) {
            return;
        }
        String hexString = Integer.toHexString(iM9242);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(iM9242).length() + 4 + 1);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(iM9242);
        throw new C3805(AbstractC3761.m6622(sb, " (0x", hexString, ")"), parcel);
    }

    /* JADX INFO: renamed from: ۦۧ */
    public static final void m9274(InterfaceC3975 interfaceC3975) {
        C0193 c0193;
        C0605 c0605M9270 = m9270(interfaceC3975);
        if (c0605M9270.f2263 || (c0193 = ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5359.m8951(c0605M9270)).f3131) == null) {
            return;
        }
        c0193.f714.f18006.m6298(c0605M9270.f2273, new C2603(c0193, c0605M9270));
    }

    /* JADX INFO: renamed from: ۦۨ */
    public static void m9275(InputStream inputStream) {
        while (inputStream.available() != 0) {
            try {
                inputStream.skip(inputStream.available());
            } catch (IOException unused) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۤ */
    public abstract void mo4163(C0083 c0083, C0083 c0084);

    /* JADX INFO: renamed from: ۥۦ */
    public abstract C0083 mo4164(AbstractC0032 abstractC0032);

    /* JADX INFO: renamed from: ۦؒ */
    public abstract void mo4165(C0083 c0083, Thread thread);

    /* JADX INFO: renamed from: ۦؖ */
    public abstract C0050 mo4166(AbstractC0032 abstractC0032);

    /* JADX INFO: renamed from: ۦؚ */
    public abstract boolean mo4167(AbstractC0032 abstractC0032, Object obj, Object obj2);

    /* JADX INFO: renamed from: ۦٌ */
    public abstract boolean mo4168(AbstractC0032 abstractC0032, C0083 c0083, C0083 c0084);

    /* JADX INFO: renamed from: ۦۗ */
    public abstract boolean mo4169(AbstractC0032 abstractC0032, C0050 c0050, C0050 c0051);
}
