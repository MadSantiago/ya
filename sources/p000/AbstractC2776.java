package p000;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.os.Trace;
import android.util.TypedValue;
import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import ru.bluecat.yandexmapspatcher.p003ui.App;

/* JADX INFO: renamed from: ۥۦٕؑۗ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2776 implements InterfaceC3819 {

    /* JADX INFO: renamed from: ۥُ */
    public static final C5536 f9252;

    /* JADX INFO: renamed from: ۦؑ */
    public static final C5536 f9256;

    /* JADX INFO: renamed from: ۥۣ */
    public static final float[] f9255 = new float[91];

    /* JADX INFO: renamed from: ۥۗ */
    public static final String[] f9254 = {"/data/local/", "/data/local/bin/", "/data/local/xbin/", "/sbin/", "/su/bin/", "/system/bin/", "/system/bin/.ext/", "/system/bin/failsafe/", "/system/sd/xbin/", "/system/usr/we-need-root/", "/system/xbin/", "/system_ext/bin/", "/cache/", "/data/", "/dev/"};

    /* JADX INFO: renamed from: ۥؗ */
    public static final int[] f9251 = {1};

    /* JADX INFO: renamed from: ۥّ */
    public static final C2793 f9253 = new C2793(0.0f, 0.0f, 10.0f, 10.0f);

    /* JADX INFO: renamed from: ۦۙ */
    public static final C4992 f9257 = new C4992(29);

    static {
        int i = 2;
        f9256 = new C5536(i, "NULL");
        f9252 = new C5536(i, "UNINITIALIZED");
    }

    /* JADX INFO: renamed from: ۥؓ */
    public static final C0742 m5210(AbstractC0941 abstractC0941) {
        C0742 c0742;
        synchronized (f9257) {
            c0742 = (C0742) abstractC0941.m1914("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (c0742 == null) {
                InterfaceC3534 interfaceC3534 = C4794.f15814;
                try {
                    C0649 c0649 = AbstractC0912.f3276;
                    interfaceC3534 = AbstractC5794.f19088.f17018;
                } catch (IllegalStateException | C1345 unused) {
                }
                C0742 c0743 = new C0742(interfaceC3534.mo860(AbstractC4554.m7891()));
                abstractC0941.m1916("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", c0743);
                c0742 = c0743;
            }
        }
        return c0742;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static final void m5211(final C3635 c3635, final boolean z, C5362 c5362, final int i) {
        C2449 c2449M9648;
        c5362.m8979(626339208);
        int i2 = (c5362.m8977(c3635) ? 4 : 2) | i | (c5362.m9006(z) ? 32 : 16);
        if (!c5362.m9011(i2 & 1, (i2 & 19) != 18)) {
            c5362.m8982();
        } else if (z) {
            c5362.m8957(1530097388);
            C5837 c5837 = c3635.f12150;
            C3828 c3828 = null;
            if (c5837 != null && (c2449M9648 = c5837.m9648()) != null) {
                C3828 c3829 = c2449M9648.f8158;
                C5837 c5838 = c3635.f12150;
                if (!(c5838 != null ? c5838.f19245 : true)) {
                    c3828 = c3829;
                }
            }
            if (c3828 == null) {
                c5362.m8957(1530097387);
                c5362.m9009(false);
            } else {
                c5362.m8957(1530097388);
                if (C3346.m6107(c3635.m6479().f18943)) {
                    c5362.m8957(2110860558);
                    c5362.m9009(false);
                } else {
                    c5362.m8957(2109807302);
                    int iMo4319 = c3635.f12147.mo4319((int) (c3635.m6479().f18943 >> 32));
                    int iMo43110 = c3635.f12147.mo4319((int) (c3635.m6479().f18943 & 4294967295L));
                    int iM6828 = c3828.m6828(iMo4319);
                    int iM6829 = c3828.m6828(Math.max(iMo43110 - 1, 0));
                    C5837 c5839 = c3635.f12150;
                    if (c5839 == null || !((Boolean) c5839.f19236.getValue()).booleanValue()) {
                        c5362.m8957(2110490542);
                        c5362.m9009(false);
                    } else {
                        c5362.m8957(2110225306);
                        AbstractC2552.m4805(true, iM6828, c3635, c5362, ((i2 << 6) & 896) | 6);
                        c5362.m9009(false);
                    }
                    C5837 c58310 = c3635.f12150;
                    if (c58310 == null || !((Boolean) c58310.f19243.getValue()).booleanValue()) {
                        c5362.m8957(2110838734);
                        c5362.m9009(false);
                    } else {
                        c5362.m8957(2110574459);
                        AbstractC2552.m4805(false, iM6829, c3635, c5362, ((i2 << 6) & 896) | 6);
                        c5362.m9009(false);
                    }
                    c5362.m9009(false);
                }
                C5837 c58311 = c3635.f12150;
                if (c58311 != null) {
                    C4852 c4852 = c58311.f19235;
                    if (!AbstractC3831.m6874(c3635.f12144.f18944.f4307, c3635.m6479().f18944.f4307)) {
                        c4852.setValue(Boolean.FALSE);
                    }
                    if (c58311.m9646()) {
                        if (((Boolean) c4852.getValue()).booleanValue()) {
                            c3635.m6470();
                        } else {
                            c3635.m6480();
                        }
                    }
                }
                c5362.m9009(false);
            }
            c5362.m9009(false);
        } else {
            c5362.m8957(1989076778);
            c5362.m9009(false);
            c3635.m6480();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new InterfaceC5731(z, i) { // from class: ۥُْ۟

                /* JADX INFO: renamed from: ۦ۟ */
                public final /* synthetic */ boolean f4256;

                @Override // p000.InterfaceC5731
                /* JADX INFO: renamed from: ۥۜ */
                public final Object mo219(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM6835 = AbstractC3831.m6835(1);
                    AbstractC2776.m5211(this.f4257, this.f4256, (C5362) obj, iM6835);
                    return C2358.f7817;
                }
            };
        }
    }

    /* JADX INFO: renamed from: ۥؙ */
    public static final void m5212(C1568 c1568, C5837 c5837, C5745 c5745, C2350 c2350, InterfaceC4120 interfaceC4120) {
        C5002 c5002 = c5837.f19234;
        C5149 c5149 = c5837.f19244;
        C5149 c51410 = c5837.f19229;
        C5450 c5450 = new C5450();
        C3464 c3464 = new C3464(c5002, c5149, c5450, 16);
        InterfaceC1637 interfaceC1637 = c1568.f5285;
        interfaceC1637.mo3446(c5745, c2350, c3464, c51410);
        C2829 c2829 = new C2829(c1568, interfaceC1637);
        c1568.f5284.set(c2829);
        c5450.f17965 = c2829;
        c5837.f19223 = c2829;
        m5241(c5837, c5745, interfaceC4120);
    }

    /* JADX INFO: renamed from: ۥؚ */
    public static final Object m5213(RunnableC1491 runnableC1491, InterfaceC5731 interfaceC5731) {
        AbstractC5568.m9348(runnableC1491, true, new C5528(AbstractC2765.m5134(runnableC1491.f18337.mo334()).mo1552(runnableC1491.f5062, runnableC1491, runnableC1491.f6194)));
        return AbstractC0487.m1066(runnableC1491, false, runnableC1491, interfaceC5731);
    }

    /* JADX INFO: renamed from: ۥً */
    public static final boolean m5214(C3828 c3828, int i) {
        C2276 c2276 = c3828.f12696;
        int iM4335 = c2276.m4335(i);
        return i == c3828.m6827(iM4335) || i == c2276.m4329(iM4335, false) ? c3828.m6831(i) != c3828.m6828(i) : c3828.m6828(i) != c3828.m6828(i - 1);
    }

    /* JADX INFO: renamed from: ۥِ */
    public static String m5215(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b : bArr) {
            if (b == 34) {
                sb.append("\\\"");
            } else if (b == 39) {
                sb.append("\\'");
            } else if (b != 92) {
                switch (b) {
                    case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b < 32 || b > 126) {
                            sb.append('\\');
                            sb.append((char) (((b >>> 6) & 3) + 48));
                            sb.append((char) (((b >>> 3) & 7) + 48));
                            sb.append((char) ((b & 7) + 48));
                        } else {
                            sb.append((char) b);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:82:0x017a  */
    /* JADX WARN: Code duplicated, block: B:85:0x0184  */
    /* JADX WARN: Code duplicated, block: B:87:0x0194  */
    /* JADX WARN: Code duplicated, block: B:88:0x0197  */
    /* JADX INFO: renamed from: ۥْ */
    public static final void m5216(InterfaceC4745 interfaceC4745, C3121 c3121, C3121 c3122, C4912 c4912, C3129 c3129, C3129 c31210) {
        int size;
        boolean z;
        C2793 c2793M9775;
        InterfaceC4745 interfaceC4746 = interfaceC4745;
        C3129 c31211 = c3129;
        int i = c31211.f10473;
        Region region = (Region) c3121.f10451;
        C3121 c3123 = c3122;
        Region region2 = (Region) c3123.f10451;
        C0605 c0605 = c31210.f10471;
        C2542 c2542 = c31210.f10476;
        C0605 c0606 = c31210.f10471;
        int i2 = c31210.f10473;
        boolean z2 = (c0605.m1342() && c0606.m1348()) ? false : true;
        if (!region2.isEmpty() || i2 == i) {
            if (!z2 || c31210.m5771()) {
                C4730 c4730M5141 = AbstractC2765.m5141(c31210.m5767());
                c3121.m5740(c4730M5141);
                if (i2 == i) {
                    i2 = -1;
                }
                if (!region.op(region2, Region.Op.INTERSECT)) {
                    if (c31210.m5771()) {
                        m5251(c4912, c3129, c31210);
                        return;
                    } else {
                        if (i2 == -1) {
                            Rect bounds = region.getBounds();
                            c4912.m8319(i2, new C1307(c31210, new C4730(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                            return;
                        }
                        return;
                    }
                }
                Rect bounds2 = region.getBounds();
                c4912.m8319(i2, new C1307(c31210, new C4730(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                List listM5756 = C3129.m5756(4, c31210);
                if (c2542.f8487) {
                    C3129 c3129M5766 = c31210.m5766();
                    while (true) {
                        if (c3129M5766 == null) {
                            c3129M5766 = null;
                            break;
                        }
                        C3262 c3262 = c3129M5766.f10476.f8490;
                        if (c3262.m6015(AbstractC2771.f9209) || c3262.m6015(AbstractC2771.f9232)) {
                            break;
                        } else {
                            c3129M5766 = c3129M5766.m5766();
                        }
                    }
                    if (c3129M5766 == null) {
                        z = false;
                    } else {
                        AbstractC1311 abstractC1311M5765 = c31210.m5765();
                        if (abstractC1311M5765 == null) {
                            abstractC1311M5765 = null;
                        } else {
                            if (!abstractC1311M5765.mo2787().f17786) {
                                abstractC1311M5765 = null;
                            }
                            if (abstractC1311M5765 == null) {
                                abstractC1311M5765 = null;
                            }
                        }
                        AbstractC1311 abstractC1311M5766 = c3129M5766.m5765();
                        if (abstractC1311M5766 == null) {
                            abstractC1311M5766 = null;
                        } else {
                            if (!abstractC1311M5766.mo2787().f17786) {
                                abstractC1311M5766 = null;
                            }
                            if (abstractC1311M5766 == null) {
                                abstractC1311M5766 = null;
                            }
                        }
                        if (abstractC1311M5765 == null || abstractC1311M5766 == null) {
                            z = false;
                        } else {
                            C2793 c2793Mo2794 = abstractC1311M5766.mo2794(abstractC1311M5765, false);
                            z = !c2793Mo2794.equals(c2793Mo2794.m5317(AbstractC5568.m9368(0L, AbstractC5537.m9235(abstractC1311M5766.f982))));
                        }
                    }
                    if (z) {
                        C3121 c3124 = new C3121(17, (byte) 0);
                        Object objM5759 = c31210.m5759();
                        if (objM5759 == null) {
                            C2935 c2935 = (C2935) c0606.f2256.f8206;
                            c2793M9775 = C4773.m8145(c2935).mo2794(c2935, false);
                        } else {
                            AbstractC5381 abstractC5381 = ((AbstractC5381) objM5759).f17791;
                            Object objM6027 = c2542.f8490.m6027(AbstractC0208.f772);
                            boolean z3 = (objM6027 == null ? null : objM6027) != null;
                            if (!abstractC5381.f17791.f17786) {
                                c2793M9775 = C2793.f9340;
                            } else if (z3) {
                                c2793M9775 = AbstractC5537.m9245(abstractC5381, 8).m9775();
                            } else {
                                AbstractC1311 abstractC1311M9245 = AbstractC5537.m9245(abstractC5381, 8);
                                c2793M9775 = C4773.m8145(abstractC1311M9245).mo2794(abstractC1311M9245, false);
                            }
                        }
                        c3124.m5740(AbstractC2765.m5141(c2793M9775));
                        int size2 = listM5756.size() - 1;
                        while (-1 < size2) {
                            if (!((Boolean) interfaceC4746.mo211(listM5756.get(size2))).booleanValue()) {
                                m5255(interfaceC4746, new C3121(17, (byte) 0), c3124, c4912, c31211, (C3129) listM5756.get(size2));
                            }
                            size2--;
                            c31211 = c3129;
                        }
                    } else {
                        size = listM5756.size() - 1;
                        while (-1 < size) {
                            if (((Boolean) interfaceC4746.mo211(listM5756.get(size))).booleanValue()) {
                                m5216(interfaceC4746, c3121, c3123, c4912, c3129, (C3129) listM5756.get(size));
                            }
                            size--;
                            interfaceC4746 = interfaceC4745;
                            c3123 = c3122;
                        }
                    }
                } else {
                    size = listM5756.size() - 1;
                    while (-1 < size) {
                        if (((Boolean) interfaceC4746.mo211(listM5756.get(size))).booleanValue()) {
                            m5216(interfaceC4746, c3121, c3123, c4912, c3129, (C3129) listM5756.get(size));
                        }
                        size--;
                        interfaceC4746 = interfaceC4745;
                        c3123 = c3122;
                    }
                }
                if (m5218(c31210)) {
                    region2.op(c4730M5141.f15612, c4730M5141.f15611, c4730M5141.f15610, c4730M5141.f15613, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥٓ */
    public static App m5217() {
        App app = App.f406;
        if (app != null) {
            return app;
        }
        new C4441(new long[]{3552874195312861818L, -8560054160986064761L, 5891758228507281278L}).toString();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0056 A[LOOP:0: B:9:0x001b->B:21:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x005b A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۥٕ */
    public static final boolean m5218(C3129 c3129) {
        if (!m5245(c3129)) {
            C2542 c2542 = c3129.f10476;
            if (c2542.f8487) {
                return true;
            }
            C3262 c3262 = c2542.f8490;
            Object[] objArr = c3262.f10947;
            Object[] objArr2 = c3262.f10944;
            long[] jArr = c3262.f10948;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                Object obj = objArr[i4];
                                Object obj2 = objArr2[i4];
                                if (((C3059) obj).f10293) {
                                    return true;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 == 8) {
                            if (i != length) {
                                i++;
                            }
                        }
                    } else if (i != length) {
                        i++;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ٘ */
    public static boolean m5219(Resources.Theme theme, int i, boolean z) {
        TypedValue typedValueM5253 = m5253(theme, i);
        if (typedValueM5253 == null || typedValueM5253.type != 18) {
            return z;
        }
        return typedValueM5253.data != 0;
    }

    /* JADX INFO: renamed from: ۥٙ */
    public static final long m5220(C5837 c5837, C2793 c2793, C2793 c2794, int i) {
        long jM5243 = m5243(c5837, c2793, i);
        if (C3346.m6107(jM5243)) {
            return C3346.f11196;
        }
        long jM5244 = m5243(c5837, c2794, i);
        if (C3346.m6107(jM5244)) {
            return C3346.f11196;
        }
        int i2 = (int) (jM5243 >> 32);
        int i3 = (int) (jM5244 & 4294967295L);
        return AbstractC2765.m5145(Math.min(i2, i2), Math.max(i3, i3));
    }

    /* JADX INFO: renamed from: ۥٛ */
    public static final void m5221(C2600 c2600, InterfaceC0443 interfaceC0443, boolean z) {
        Object objMo4906 = c2600.mo4906();
        Throwable thMo4911 = c2600.mo4911(objMo4906);
        Object c4535 = thMo4911 != null ? new C4535(thMo4911) : c2600.mo4905(objMo4906);
        if (!z) {
            interfaceC0443.mo335(c4535);
            return;
        }
        C4437 c4437 = (C4437) interfaceC0443;
        AbstractC0772 abstractC0772 = c4437.f14626;
        Object obj = c4437.f14629;
        InterfaceC3534 interfaceC3534Mo334 = abstractC0772.mo334();
        Object objM5152 = AbstractC2765.m5152(interfaceC3534Mo334, obj);
        C5278 c5278M5193 = objM5152 != AbstractC2765.f9155 ? AbstractC2774.m5193(abstractC0772, interfaceC3534Mo334, objM5152) : null;
        try {
            c4437.f14626.mo335(c4535);
        } finally {
            if (c5278M5193 == null || c5278M5193.m8915()) {
                AbstractC2765.m5121(interfaceC3534Mo334, objM5152);
            }
        }
    }

    /* JADX INFO: renamed from: ۥٝ */
    public static long m5222(double d) {
        if (!Double.isNaN(d)) {
            return Math.round(d);
        }
        C1078.m2272("Cannot round NaN value.");
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public static String[] m5223() {
        ArrayList arrayList = new ArrayList(Arrays.asList(f9254));
        String str = System.getenv("PATH");
        if (str == null || "".equals(str)) {
            return (String[]) arrayList.toArray(new String[0]);
        }
        String[] strArrSplit = str.split(":");
        int length = strArrSplit.length;
        for (int i = 0; i < length; i++) {
            String strConcat = strArrSplit[i];
            if (!strConcat.endsWith("/")) {
                strConcat = strConcat.concat("/");
            }
            if (!arrayList.contains(strConcat)) {
                arrayList.add(strConcat);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static final void m5224(InterfaceC0705 interfaceC0705, C3635 c3635, C0857 c0857, C5362 c5362, int i) {
        c5362.m8979(2036174316);
        int i2 = (c5362.m8963(interfaceC0705) ? 4 : 2) | i | (c5362.m8977(c3635) ? 32 : 16);
        if (c5362.m9011(i2 & 1, (i2 & 147) != 146)) {
            InterfaceC3228 interfaceC3228M2297 = AbstractC1089.m2297(C1298.f4456, true);
            int iHashCode = Long.hashCode(c5362.f17657);
            C2103 c2103M8994 = c5362.m8994();
            InterfaceC0705 interfaceC0705M2161 = AbstractC0993.m2161(c5362, interfaceC0705);
            InterfaceC4576.f15106.getClass();
            C3709 c3709 = C0849.f3049;
            c5362.m8983();
            if (c5362.f17668) {
                c5362.m9005(c3709);
            } else {
                c5362.m8972();
            }
            AbstractC0993.m2127(C0849.f3048, c5362, interfaceC3228M2297);
            AbstractC0993.m2127(C0849.f3047, c5362, c2103M8994);
            AbstractC0993.m2127(C0849.f3053, c5362, Integer.valueOf(iHashCode));
            AbstractC0993.m2146(c5362, C0849.f3050);
            AbstractC0993.m2127(C0849.f3052, c5362, interfaceC0705M2161);
            AbstractC3933.m7070(c3635, c0857, c5362, (i2 >> 3) & 126);
            c5362.m9009(true);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C3659(interfaceC0705, c3635, c0857, i);
        }
    }

    /* JADX INFO: renamed from: ۥۙ */
    public static final boolean m5225(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static int m5226(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), packageName);
                    if (iNoteProxyOpNoThrow == 0) {
                        iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, AbstractC5183.m8787(context)) : 1;
                    }
                } else {
                    iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
                }
                if (iNoteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۥۡ */
    public static final long m5227(String str, long j, long j2, long j3) {
        String property;
        int i = AbstractC1768.f5896;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lM8361 = AbstractC4981.m8361(property);
        if (lM8361 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lM8361.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    /* JADX WARN: Code duplicated, block: B:203:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:206:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:208:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:210:0x0408  */
    /* JADX WARN: Code duplicated, block: B:211:0x041a  */
    /* JADX WARN: Code duplicated, block: B:214:0x041f  */
    /* JADX WARN: Code duplicated, block: B:215:0x0428  */
    /* JADX WARN: Code duplicated, block: B:217:0x0430  */
    /* JADX WARN: Code duplicated, block: B:220:0x0445 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:224:0x044e  */
    /* JADX WARN: Code duplicated, block: B:227:0x0465  */
    /* JADX WARN: Code duplicated, block: B:230:0x0470  */
    /* JADX WARN: Code duplicated, block: B:233:0x0482  */
    /* JADX WARN: Code duplicated, block: B:235:0x0486  */
    /* JADX WARN: Code duplicated, block: B:238:0x0492  */
    /* JADX WARN: Code duplicated, block: B:241:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:244:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:247:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:250:0x052e  */
    /* JADX WARN: Code duplicated, block: B:251:0x0536  */
    /* JADX WARN: Code duplicated, block: B:253:0x055e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:254:0x0560  */
    /* JADX WARN: Code duplicated, block: B:258:0x058a  */
    /* JADX WARN: Code duplicated, block: B:259:0x058c  */
    /* JADX WARN: Code duplicated, block: B:262:0x0594  */
    /* JADX WARN: Code duplicated, block: B:263:0x0596  */
    /* JADX WARN: Code duplicated, block: B:266:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:267:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:270:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:273:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:274:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:277:0x05cd A[PHI: r14 r19 r25
  0x05cd: PHI (r14v28 ۥٜۛؔ) = (r14v18 ۥٜۛؔ), (r14v29 ۥٜۛؔ) binds: [B:276:0x05cb, B:273:0x05bc] A[DONT_GENERATE, DONT_INLINE]
  0x05cd: PHI (r19v7 boolean) = (r19v1 boolean), (r19v9 boolean) binds: [B:276:0x05cb, B:273:0x05bc] A[DONT_GENERATE, DONT_INLINE]
  0x05cd: PHI (r25v11 ۦًۧؖۢ) = (r25v1 ۦًۧؖۢ), (r25v12 ۦًۧؖۢ) binds: [B:276:0x05cb, B:273:0x05bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:278:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:281:0x05ec A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:284:0x060b  */
    /* JADX WARN: Code duplicated, block: B:287:0x0669  */
    /* JADX WARN: Code duplicated, block: B:291:0x0673  */
    /* JADX WARN: Code duplicated, block: B:293:0x0679 A[PHI: r31
  0x0679: PHI (r31v6 ۦًۧؖۢ) = (r31v4 ۦًۧؖۢ), (r31v7 ۦًۧؖۢ) binds: [B:292:0x0677, B:290:0x0670] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:294:0x067b  */
    /* JADX WARN: Code duplicated, block: B:297:0x0684 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:300:0x0696  */
    /* JADX WARN: Code duplicated, block: B:303:0x06de  */
    /* JADX WARN: Code duplicated, block: B:306:0x0716  */
    /* JADX WARN: Code duplicated, block: B:307:0x0718  */
    /* JADX WARN: Code duplicated, block: B:310:0x072a  */
    /* JADX WARN: Code duplicated, block: B:311:0x072c  */
    /* JADX WARN: Code duplicated, block: B:314:0x0739 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:317:0x073f  */
    /* JADX WARN: Code duplicated, block: B:320:0x076e  */
    /* JADX WARN: Code duplicated, block: B:328:0x07a3  */
    /* JADX WARN: Code duplicated, block: B:330:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:331:0x07bc  */
    /* JADX WARN: Code duplicated, block: B:334:0x07ca A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:335:0x07cc  */
    /* JADX WARN: Code duplicated, block: B:338:0x07e6  */
    /* JADX WARN: Code duplicated, block: B:339:0x07e8  */
    /* JADX WARN: Code duplicated, block: B:342:0x07ee  */
    /* JADX WARN: Code duplicated, block: B:344:0x07f4  */
    /* JADX WARN: Code duplicated, block: B:350:0x0802 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:353:0x0807  */
    /* JADX WARN: Code duplicated, block: B:356:0x0823  */
    /* JADX WARN: Code duplicated, block: B:357:0x0825  */
    /* JADX WARN: Code duplicated, block: B:361:0x0847  */
    /* JADX WARN: Code duplicated, block: B:363:0x084b  */
    /* JADX WARN: Code duplicated, block: B:367:0x0869 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:370:0x086e  */
    /* JADX WARN: Code duplicated, block: B:373:0x08a2  */
    /* JADX WARN: Code duplicated, block: B:376:0x08b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:377:0x08b8  */
    /* JADX WARN: Code duplicated, block: B:380:0x092f  */
    /* JADX WARN: Code duplicated, block: B:387:0x0958  */
    /* JADX WARN: Code duplicated, block: B:389:0x095c  */
    /* JADX INFO: renamed from: ۥۣ */
    public static final void m5228(final C5745 c5745, final InterfaceC4745 interfaceC4745, final InterfaceC0705 interfaceC0705, final C3564 c3564, final C2316 c2316, final InterfaceC4745 interfaceC4746, final C2243 c2243, final C0547 c0547, final boolean z, final int i, final int i2, final C2350 c2350, final C0163 c0163, final boolean z2, final C0857 c0857, C5362 c5362, final int i3, final int i4) {
        int i5;
        int i6;
        Object c5837;
        boolean z3;
        InterfaceC4434 interfaceC4434;
        C3564 c3565;
        C4036 c4036;
        C1249 c1249;
        InterfaceC2880 interfaceC2880;
        InterfaceC4434 interfaceC4435;
        InterfaceC2880 interfaceC2881;
        long j;
        C5002 c5002;
        C2829 c2829;
        C3346 c3346;
        String str;
        C1249 c12410;
        boolean z4;
        boolean z5;
        long j2;
        long jLongValue;
        C5745 c5745M9570;
        C5745 c5746;
        Object objM8999;
        C4036 c4037;
        final C3260 c3260;
        long jCurrentTimeMillis;
        Object objM89910;
        final InterfaceC4643 interfaceC4643;
        Object objM89911;
        final C0489 c0489;
        Object objM89912;
        final C3635 c3635;
        C5668 c5668;
        Context context;
        InterfaceC3534 interfaceC3534;
        boolean zM8963;
        Object objM89913;
        InterfaceC2007 interfaceC2007;
        boolean z6;
        int i7;
        boolean z7;
        boolean z8;
        int i8;
        boolean z9;
        boolean z10;
        int i9;
        C2350 c2351;
        boolean z11;
        C5837 c5838;
        boolean z12;
        boolean zM8977;
        Object obj;
        C5362 c5363;
        final C5837 c5839;
        final C2350 c2352;
        final C1568 c1568;
        InterfaceC4120 interfaceC4120;
        C0489 c04810;
        boolean z13;
        C5745 c5747;
        final C3635 c3636;
        C4217 c4217;
        InterfaceC4367 interfaceC4367M5175;
        C5837 c58310;
        boolean z14;
        boolean z15;
        Object c2495;
        InterfaceC4643 interfaceC4644;
        InterfaceC0705 interfaceC0705M2152;
        final C5837 c58311;
        InterfaceC4367 interfaceC4367;
        InterfaceC0705 interfaceC0705M5588;
        InterfaceC4745 interfaceC4747;
        final InterfaceC4120 interfaceC4121;
        int i10;
        boolean z16;
        boolean z17;
        boolean zM8978;
        Object objM89914;
        final C3635 c3637;
        C1568 c1569;
        final C5837 c58312;
        boolean z18;
        InterfaceC4120 interfaceC4122;
        InterfaceC0705 interfaceC0705M2153;
        boolean zM8979;
        Object objM89915;
        boolean z19;
        boolean z20;
        Object objM89916;
        C2350 c2353;
        final boolean z21;
        int i11;
        boolean z22;
        boolean zM9006;
        Object objM89917;
        Object c0548;
        long j3;
        long jM7468;
        boolean zM89710;
        Object objM89918;
        boolean z23;
        Long l;
        C5362 c5364 = c5362;
        c5364.m8979(31062401);
        if ((i3 & 6) == 0) {
            i5 = i3 | (c5364.m8963(c5745) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= c5364.m8977(interfaceC4745) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= c5364.m8963(interfaceC0705) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= c5364.m8963(c3564) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= c5364.m8963(c2316) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i5 |= c5364.m8977(interfaceC4746) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= c5364.m8963(c2243) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= c5364.m8963(c0547) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= c5364.m9006(z) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= c5364.m8988(i) ? 536870912 : 268435456;
        }
        if ((i4 & 6) == 0) {
            i6 = i4 | (c5364.m8988(i2) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= c5364.m8963(c2350) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= c5364.m8963(c0163) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= c5364.m9006(z2) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 |= c5364.m9006(false) ? 16384 : 8192;
        }
        if ((i4 & 196608) == 0) {
            i6 |= c5364.m8977(c0857) ? 131072 : 65536;
        }
        int i12 = i6 | 1572864;
        if (c5364.m9011(i5 & 1, ((i5 & 306783379) == 306783378 && (599187 & i12) == 599186) ? false : true)) {
            c5364.m8971();
            if ((i3 & 1) != 0 && !c5364.m8969()) {
                c5364.m8982();
            }
            c5364.m8964();
            Object objM89919 = c5364.m8999();
            C4036 c4038 = C2850.f9517;
            if (objM89919 == c4038) {
                objM89919 = new C3985();
                c5364.m8987(objM89919);
            }
            final C3985 c3985 = (C3985) objM89919;
            Object objM89920 = c5364.m8999();
            if (objM89920 == c4038) {
                C3736 c3736 = AbstractC0831.f2935;
                objM89920 = new C3969();
                c5364.m8987(objM89920);
            }
            C3969 c3969 = (C3969) objM89920;
            Object objM89921 = c5364.m8999();
            if (objM89921 == c4038) {
                objM89921 = new C1568(c3969);
                c5364.m8987(objM89921);
            }
            C1568 c15610 = (C1568) objM89921;
            InterfaceC2880 interfaceC2882 = (InterfaceC2880) c5364.m8997(AbstractC2853.f9544);
            InterfaceC4434 interfaceC4436 = (InterfaceC4434) c5364.m8997(AbstractC2853.f9553);
            long j4 = ((C5480) c5364.m8997(AbstractC4457.f14701)).f18077;
            InterfaceC0475 interfaceC0475 = (InterfaceC0475) c5364.m8997(AbstractC2853.f9552);
            final InterfaceC0930 interfaceC0930 = (InterfaceC0930) c5364.m8997(AbstractC2853.f9551);
            InterfaceC3508 interfaceC3508 = (InterfaceC3508) c5364.m8997(AbstractC2853.f9539);
            EnumC1616 enumC1616 = EnumC1616.f5425;
            EnumC1616 enumC1617 = (i == 1 && !z && c2350.f7795) ? EnumC1616.f5424 : enumC1616;
            c5364.m8957(-213744626);
            Object[] objArr = {enumC1617};
            C2346 c2346 = C4950.f16376;
            boolean zM8988 = c5364.m8988(enumC1617.ordinal());
            Object objM89922 = c5364.m8999();
            if (zM8988 || objM89922 == c4038) {
                objM89922 = new C0101(10, enumC1617);
                c5364.m8987(objM89922);
            }
            C4950 c4950 = (C4950) AbstractC5378.m9036(objArr, c2346, (InterfaceC4448) objM89922, c5364, 0);
            c5364.m9009(false);
            if (((EnumC1616) c4950.f16379.getValue()) != enumC1617) {
                throw new IllegalArgumentException("Mismatching scroller orientation; ".concat(enumC1617 == enumC1616 ? "only single-line, non-wrap text fields can scroll horizontally" : "single-line, non-wrap text fields can only scroll horizontally"));
            }
            int i13 = i5 & 14;
            boolean z24 = (i13 == 4) | ((i5 & 57344) == 16384);
            Object objM89923 = c5364.m8999();
            int i14 = 8;
            if (z24 || objM89923 == c4038) {
                C3263 c3263M7100 = AbstractC3933.m7100(c2316, c5745.f18944);
                InterfaceC4120 interfaceC4123 = c3263M7100.f10950;
                C3346 c3347 = c5745.f18942;
                if (c3347 != null) {
                    long j5 = c3347.f11197;
                    int i15 = C3346.f11195;
                    int iMo4319 = interfaceC4123.mo4319((int) (j5 >> 32));
                    int iMo43110 = interfaceC4123.mo4319((int) (j5 & 4294967295L));
                    int iMin = Math.min(iMo4319, iMo43110);
                    int iMax = Math.max(iMo4319, iMo43110);
                    C4042 c4042 = new C4042(c3263M7100.f10951);
                    c4042.f13481.add(new C2181(new C0553(0L, 0L, (C1626) null, (C5827) null, (C2848) null, (AbstractC0903) null, (String) null, 0L, (C3917) null, (C5647) null, (C5668) null, 0L, C1690.f5634, (C5906) null, 61439), iMin, iMax, i14));
                    objM89923 = new C3263(c4042.m7241(), interfaceC4123);
                } else {
                    objM89923 = c3263M7100;
                }
                c5364.m8987(objM89923);
            } else {
                i13 = i13;
                c4950 = c4950;
            }
            C3263 c3263 = (C3263) objM89923;
            C1249 c12411 = c3263.f10951;
            final InterfaceC4120 interfaceC4124 = c3263.f10950;
            C5863 c5863M8998 = c5364.m8998();
            if (c5863M8998 == null) {
                C1078.m2276("no recompose scope found");
                return;
            }
            c5863M8998.f19363 |= 1;
            boolean zM8964 = c5364.m8963(interfaceC3508);
            Object objM89924 = c5364.m8999();
            C2340 c2340 = C2340.f7777;
            if (zM8964 || objM89924 == c4038) {
                z3 = z;
                interfaceC4434 = interfaceC4436;
                c3565 = c3564;
                c4036 = c4038;
                c1249 = c12411;
                c5837 = new C5837(new C0441(c12411, c3565, z3, interfaceC2882, interfaceC4434, c2340), c5863M8998, interfaceC3508);
                c5364.m8987(c5837);
            } else {
                z3 = z;
                c4036 = c4038;
                c5837 = objM89924;
                interfaceC4434 = interfaceC4436;
                c3565 = c3564;
                c1249 = c12411;
            }
            C5837 c58313 = (C5837) c5837;
            C1249 c12412 = c5745.f18944;
            long j6 = c5745.f18943;
            c58313.f19239 = interfaceC4745;
            c58313.f19220 = j4;
            C5852 c5852 = c58313.f19226;
            c5852.f19301 = c0163;
            c5852.f19300 = interfaceC0475;
            c58313.f19237 = c12412;
            C0441 c0441 = c58313.f19232;
            if (AbstractC3831.m6874(c0441.f1627, c1249) && AbstractC3831.m6874(c0441.f1625, c3565) && c0441.f1622 == z3) {
                interfaceC2880 = interfaceC2882;
                if (AbstractC3831.m6874(c0441.f1628, interfaceC2880) && AbstractC3831.m6874(c0441.f1624, c2340)) {
                    interfaceC4435 = interfaceC4434;
                    if (c0441.f1623 == interfaceC4435) {
                        interfaceC2881 = interfaceC2880;
                        j = j6;
                    }
                    if (c58313.f19232 != c0441) {
                        c58313.f19245 = true;
                    }
                    c58313.f19232 = c0441;
                    c5002 = c58313.f19234;
                    c2829 = c58313.f19223;
                    c5002.getClass();
                    c3346 = c5745.f18942;
                    boolean zM6874 = AbstractC3831.m6874(c3346, ((C1093) c5002.f16550).m2307());
                    str = ((C5745) c5002.f16551).f18944.f4307;
                    c12410 = c5745.f18944;
                    if (AbstractC3831.m6874(str, c12410.f4307)) {
                        if (C3346.m6110(((C5745) c5002.f16551).f18943, j)) {
                            z4 = false;
                        } else {
                            ((C1093) c5002.f16550).m2309(C3346.m6109(j), C3346.m6108(j));
                            z4 = false;
                            z5 = true;
                        }
                        if (c3346 == null) {
                            C1093 c1093 = (C1093) c5002.f16550;
                            c1093.f3842 = -1;
                            c1093.f3839 = -1;
                        } else {
                            j2 = c3346.f11197;
                            if (!C3346.m6107(j2)) {
                                ((C1093) c5002.f16550).m2308(C3346.m6109(j2), C3346.m6108(j2));
                            }
                        }
                        if (z4 && (z5 || zM6874)) {
                            c5745M9570 = c5745;
                            jLongValue = 0;
                        } else {
                            C1093 c1094 = (C1093) c5002.f16550;
                            c1094.f3842 = -1;
                            c1094.f3839 = -1;
                            jLongValue = 0;
                            c5745M9570 = C5745.m9570(c5745, null, 0L, 3);
                        }
                        c5746 = (C5745) c5002.f16551;
                        c5002.f16551 = c5745M9570;
                        if (c2829 != null) {
                            c2829.m5393(c5746, c5745M9570);
                        }
                        objM8999 = c5364.m8999();
                        c4037 = c4036;
                        if (objM8999 == c4037) {
                            objM8999 = new C3260();
                            c5364.m8987(objM8999);
                        }
                        c3260 = (C3260) objM8999;
                        jCurrentTimeMillis = System.currentTimeMillis();
                        if (c3260.f10938) {
                            c3260.f10941 = Long.valueOf(jCurrentTimeMillis);
                            c3260.m6014(c5745);
                        } else {
                            l = c3260.f10941;
                            if (l != null) {
                                jLongValue = l.longValue();
                            }
                            if (jCurrentTimeMillis > jLongValue + 5000) {
                                c3260.f10941 = Long.valueOf(jCurrentTimeMillis);
                                c3260.m6014(c5745);
                            }
                        }
                        objM89910 = c5364.m8999();
                        if (objM89910 == c4037) {
                            objM89910 = AbstractC3925.m7061(c5364);
                            c5364.m8987(objM89910);
                        }
                        interfaceC4643 = (InterfaceC4643) objM89910;
                        objM89911 = c5364.m8999();
                        if (objM89911 == c4037) {
                            objM89911 = new C0489();
                            c5364.m8987(objM89911);
                        }
                        c0489 = (C0489) objM89911;
                        objM89912 = c5364.m8999();
                        if (objM89912 == c4037) {
                            objM89912 = new C3635(c3260);
                            c5364.m8987(objM89912);
                        }
                        c3635 = (C3635) objM89912;
                        c3635.f12147 = interfaceC4124;
                        c3635.f12138 = c58313.f19244;
                        c3635.f12150 = c58313;
                        c3635.f12140.setValue(c5745);
                        c3635.f12160 = new C3346(j);
                        c3635.f12158 = (InterfaceC1625) c5364.m8997(AbstractC2853.f9538);
                        c3635.f12148 = interfaceC4643;
                        c3635.f12153 = (InterfaceC1922) c5364.m8997(AbstractC2853.f9547);
                        c3635.f12157 = c3985;
                        final boolean z25 = true;
                        c3635.f12151.setValue(true);
                        c3635.f12152.setValue(Boolean.valueOf(z2));
                        c5364.m8957(1966756105);
                        c5668 = c3565.f11803.f1995;
                        C4216 c4216 = AbstractC0339.f1263;
                        c5364.m8957(430530635);
                        if (Build.VERSION.SDK_INT < 28) {
                            z6 = false;
                            c5364.m9009(false);
                            interfaceC2007 = null;
                        } else {
                            context = (Context) c5364.m8997(AbstractC4354.f14355);
                            interfaceC3534 = (InterfaceC3534) c5364.m8997(AbstractC0339.f1263);
                            zM8963 = c5364.m8963(interfaceC3534) | c5364.m8963(context) | c5364.m8963(c5668);
                            objM89913 = c5364.m8999();
                            if (zM8963 || objM89913 == c4037) {
                                AbstractC0339.f1262.getClass();
                                objM89913 = new C0385(interfaceC3534, context, EnumC1383.f4735, c5668);
                                c5364.m8987(objM89913);
                            }
                            interfaceC2007 = (InterfaceC2007) objM89913;
                            z6 = false;
                            c5364.m9009(false);
                        }
                        c3635.f12156 = interfaceC2007;
                        c5364.m9009(z6);
                        c58313.m9646();
                        boolean zM89711 = c5364.m8977(c58313);
                        i7 = i12 & 7168;
                        if (i7 == 2048) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        boolean z26 = zM89711 | z7;
                        if ((i12 & 57344) == 16384) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        boolean zM89712 = z26 | z8 | c5364.m8977(c15610);
                        i8 = i13;
                        if (i8 == 4) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        z10 = zM89712 | z9;
                        i9 = (i12 & 112) ^ 48;
                        if (i9 > 32) {
                            c2351 = c2350;
                            if (!c5364.m8963(c2351)) {
                                z11 = z10;
                                c5838 = c58313;
                            }
                            z12 = true;
                            zM8977 = z11 | z12 | c5364.m8977(interfaceC4124) | c5364.m8977(interfaceC4643) | c5364.m8977(c0489) | c5364.m8977(c3635);
                            Object objM89925 = c5364.m8999();
                            if (!zM8977 || objM89925 == c4037) {
                                c5363 = c5364;
                                c5839 = c5838;
                                c2352 = c2351;
                                c1568 = c15610;
                                obj = new InterfaceC4745() { // from class: ۦّۡؓٚ
                                    @Override // p000.InterfaceC4745
                                    /* JADX INFO: renamed from: ۦؚ */
                                    public final Object mo211(Object obj2) {
                                        C2449 c2449M9648;
                                        EnumC4125 enumC4125 = (EnumC4125) obj2;
                                        C5837 c58314 = c5839;
                                        boolean zM9646 = c58314.m9646();
                                        boolean zM7315 = enumC4125.m7315();
                                        C2358 c2358 = C2358.f7817;
                                        if (zM9646 != zM7315) {
                                            c58314.f19224.setValue(Boolean.valueOf(enumC4125.m7315()));
                                            boolean zM9647 = c58314.m9646();
                                            C5745 c5748 = c5745;
                                            InterfaceC4120 interfaceC4125 = interfaceC4124;
                                            if (zM9647 && z2) {
                                                AbstractC2776.m5212(c1568, c58314, c5748, c2352, interfaceC4125);
                                            } else {
                                                AbstractC2776.m5239(c58314);
                                            }
                                            if (enumC4125.m7315() && (c2449M9648 = c58314.m9648()) != null) {
                                                AbstractC2765.m5135(interfaceC4643, null, 0, new C2495(c0489, c5748, c58314, c2449M9648, interfaceC4125, null, 2), 3);
                                            }
                                            if (!enumC4125.m7315()) {
                                                c3635.m6478(null);
                                            }
                                        }
                                        return c2358;
                                    }
                                };
                                interfaceC4120 = interfaceC4124;
                                c04810 = c0489;
                                z13 = z2;
                                interfaceC4643 = interfaceC4643;
                                c5747 = c5745;
                                c3636 = c3635;
                                c5363.m8987(obj);
                            } else {
                                obj = objM89925;
                                interfaceC4120 = interfaceC4124;
                                c5839 = c5838;
                                z13 = z2;
                                c04810 = c0489;
                                c2352 = c2351;
                                c5747 = c5745;
                                c1568 = c15610;
                                c3636 = c3635;
                                c5363 = c5364;
                            }
                            c4217 = C4217.f13994;
                            InterfaceC0705 interfaceC0705M9239 = AbstractC5537.m9239(C5063.m8621(AbstractC2765.m5122(c4217, 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0641: INVOKE (r0v44 'interfaceC0705M9239' ￛﾥ￘ﾙ￘ﾑ￙ﾟ￘ﾔ) = 
                                  (wrap ￛﾥ￘ﾙ￘ﾑ￙ﾟ￘ﾔ:0x063d: INVOKE 
                                  (wrap ￛﾥ￘ﾙ￘ﾑ￙ﾟ￘ﾔ:0x0639: INVOKE (r6v17 'c4217' ￛﾦ￙ﾕ￘ﾒￛﾘￛﾦ), (r8v9 ?? I:??[OBJECT, ARRAY]) STATIC call: ￛﾥￛﾥ￘ﾗ￙ﾖ￙ﾞ.ￛﾥ￘ﾙ(ￛﾥ￘ﾙ￘ﾑ￙ﾟ￘ﾔ, ￛﾦ￙ﾐ￘ﾖ￙ﾗￛﾨ):ￛﾥ￘ﾙ￘ﾑ￙ﾟ￘ﾔ A[MD:(ￛﾥ￘ﾙ￘ﾑ￙ﾟ￘ﾔ, ￛﾦ￙ﾐ￘ﾖ￙ﾗￛﾨ):ￛﾥ￘ﾙ￘ﾑ￙ﾟ￘ﾔ (m), WRAPPED])
                                  (wrap ￛﾦ￙ﾝ￘ﾔ￙ﾏ￙ﾌ:0x0635: CHECK_CAST (ￛﾦ￙ﾝ￘ﾔ￙ﾏ￙ﾌ) (r0v41 'obj' java.lang.Object))
                                 STATIC call: ￛﾦￛﾘ￘ﾗￛﾛ￘ﾘ.ￛﾥ￙ﾘ(ￛﾥ￘ﾙ￘ﾑ￙ﾟ￘ﾔ, ￛﾦ￙ﾝ￘ﾔ￙ﾏ￙ﾌ):ￛﾥ￘ﾙ￘ﾑ￙ﾟ￘ﾔ A[MD:(ￛﾥ￘ﾙ￘ﾑ￙ﾟ￘ﾔ, ￛﾦ￙ﾝ￘ﾔ￙ﾏ￙ﾌ):ￛﾥ￘ﾙ￘ﾑ￙ﾟ￘ﾔ (m), WRAPPED] (LINE:211))
                                  (r9v18 'z13' boolean)
                                  (r69v0 'c2243' ￛﾥￛﾙ￙ﾛￛﾡ A[DONT_INLINE, IMMUTABLE_TYPE, METHOD_ARGUMENT])
                                 STATIC call: ￛﾦￛﾢ￘ﾔ￙ﾟￛﾙ.ￛﾥￛﾙ(ￛﾥ￘ﾙ￘ﾑ￙ﾟ￘ﾔ, boolean, ￛﾥￛﾙ￙ﾛￛﾡ):ￛﾥ￘ﾙ￘ﾑ￙ﾟ￘ﾔ A[DECLARE_VAR, MD:(ￛﾥ￘ﾙ￘ﾑ￙ﾟ￘ﾔ, boolean, ￛﾥￛﾙ￙ﾛￛﾡ):ￛﾥ￘ﾙ￘ﾑ￙ﾟ￘ﾔ (m)] (LINE:212) in method: ￛﾥￛﾦ￘ﾑￛﾗ￙ﾕ.ￛﾥￛﾣ(ￛﾦￛﾦ￘ﾒ￙ﾖ￙ﾎ, ￛﾦ￙ﾝ￘ﾔ￙ﾏ￙ﾌ, ￛﾥ￘ﾙ￘ﾑ￙ﾟ￘ﾔ, ￛﾦ￘ﾙ￘ﾗ￘ﾙ￙ﾔ, ￛﾥￛﾛ￘ﾓￛﾖ￙ﾒ, ￛﾦ￙ﾝ￘ﾔ￙ﾏ￙ﾌ, ￛﾥￛﾙ￙ﾛￛﾡ, ￛﾥ￘ﾖ￘ﾖ￙ﾎ￙ﾝ, boolean, int, int, ￛﾥￛﾛ￙ﾜ￘ﾔ, ￛﾥ￘ﾐￛﾡ￘ﾓ, boolean, ￛﾥ￙ﾋ￘ﾖￛﾠ￘ﾒ, ￛﾦￛﾟ￘ﾗ￙ﾙￛﾟ, int, int):void, file: classes.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                                	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                                	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                                	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r8v9 ??
                                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                                */
                            /*
                                Method dump skipped, instruction units count: 2535
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC2776.m5228(ۦۦَٖؒ, ۦٌُٝؔ, ۥؙٟؑؔ, ۦؙؙؗٔ, ۥْۛؓۖ, ۦٌُٝؔ, ۥۙٛۡ, ۥَؖؖٝ, boolean, int, int, ۥٜۛؔ, ۥؐۡؓ, boolean, ۥًؖ۠ؒ, ۦ۟ؗٙ۟, int, int):void");
                        }

                        /* JADX INFO: renamed from: ۥۤ */
                        public static int m5229(double d) {
                            if (Double.isNaN(d)) {
                                C1078.m2272("Cannot round NaN value.");
                                return 0;
                            }
                            if (d > 2.147483647E9d) {
                                return Integer.MAX_VALUE;
                            }
                            if (d < -2.147483648E9d) {
                                return Integer.MIN_VALUE;
                            }
                            return (int) Math.round(d);
                        }

                        /* JADX INFO: renamed from: ۥۥ */
                        public static final long m5230(long j, long j2) {
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
                            return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                        }

                        /* JADX INFO: renamed from: ۥۦ */
                        public static List m5231(Object... objArr) {
                            int length = objArr.length;
                            if (length != 0) {
                                return length != 1 ? Collections.unmodifiableList(Arrays.asList(objArr)) : Collections.singletonList(objArr[0]);
                            }
                            return Collections.EMPTY_LIST;
                        }

                        /* JADX INFO: renamed from: ۥۧ */
                        public static InterfaceC0443 m5232(InterfaceC0443 interfaceC0443) {
                            AbstractC0772 abstractC0772 = interfaceC0443 instanceof AbstractC0772 ? (AbstractC0772) interfaceC0443 : null;
                            if (abstractC0772 == null || (interfaceC0443 = abstractC0772.f2790) != null) {
                                return interfaceC0443;
                            }
                            AbstractC2132 abstractC2132 = (AbstractC2132) abstractC0772.mo334().mo865(C0373.f1369);
                            InterfaceC0443 c4437 = abstractC2132 != null ? new C4437(abstractC2132, abstractC0772) : abstractC0772;
                            abstractC0772.f2790 = c4437;
                            return c4437;
                        }

                        /* JADX INFO: renamed from: ۥۨ */
                        public static final long m5233(PointF pointF) {
                            float f = pointF.x;
                            float f2 = pointF.y;
                            return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
                        }

                        /* JADX INFO: renamed from: ۦؑ */
                        public static final void m5234(C3635 c3635, C5362 c5362, int i) {
                            C1249 c1249M6484;
                            c5362.m8979(-1436003720);
                            int i2 = 2;
                            int i3 = (c5362.m8977(c3635) ? 4 : 2) | i;
                            if (c5362.m9011(i3 & 1, (i3 & 3) != 2)) {
                                C5837 c5837 = c3635.f12150;
                                if (c5837 == null || !((Boolean) c5837.f19246.getValue()).booleanValue() || (c1249M6484 = c3635.m6484()) == null || c1249M6484.f4307.length() <= 0) {
                                    c5362.m8957(-2111042550);
                                    c5362.m9009(false);
                                } else {
                                    c5362.m8957(-2112351432);
                                    boolean zM8963 = c5362.m8963(c3635);
                                    Object objM8999 = c5362.m8999();
                                    Object obj = C2850.f9517;
                                    if (zM8963 || objM8999 == obj) {
                                        objM8999 = new C3309(c3635);
                                        c5362.m8987(objM8999);
                                    }
                                    InterfaceC1126 interfaceC1126 = (InterfaceC1126) objM8999;
                                    InterfaceC2880 interfaceC2880 = (InterfaceC2880) c5362.m8997(AbstractC2853.f9544);
                                    InterfaceC4120 interfaceC4120 = c3635.f12147;
                                    long j = c3635.m6479().f18943;
                                    int i4 = C3346.f11195;
                                    int iMo4319 = interfaceC4120.mo4319((int) (j >> 32));
                                    C5837 c5838 = c3635.f12150;
                                    C3828 c3828 = (c5838 != null ? c5838.m9648() : null).f8158;
                                    C2793 c2793M6824 = c3828.m6824(AbstractC4554.m7934(iMo4319, 0, c3828.f12697.f8430.f4307.length()));
                                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((interfaceC2880.mo741(2.0f) / 2.0f) + c2793M6824.f9343)) << 32) | (((long) Float.floatToRawIntBits(c2793M6824.f9344)) & 4294967295L);
                                    boolean zM8961 = c5362.m8961(jFloatToRawIntBits);
                                    Object objM89910 = c5362.m8999();
                                    if (zM8961 || objM89910 == obj) {
                                        objM89910 = new C2117(jFloatToRawIntBits);
                                        c5362.m8987(objM89910);
                                    }
                                    InterfaceC3457 interfaceC3457 = (InterfaceC3457) objM89910;
                                    boolean zM8977 = c5362.m8977(interfaceC1126) | c5362.m8977(c3635);
                                    Object objM89911 = c5362.m8999();
                                    if (zM8977 || objM89911 == obj) {
                                        objM89911 = new C4490(interfaceC1126, c3635);
                                        c5362.m8987(objM89911);
                                    }
                                    InterfaceC0705 interfaceC0705M5588 = AbstractC2995.m5588(C4217.f13994, interfaceC1126, (PointerInputEventHandler) objM89911);
                                    boolean zM8962 = c5362.m8961(jFloatToRawIntBits);
                                    Object objM89912 = c5362.m8999();
                                    if (zM8962 || objM89912 == obj) {
                                        objM89912 = new C5860(jFloatToRawIntBits, i2);
                                        c5362.m8987(objM89912);
                                    }
                                    AbstractC0131.m288(interfaceC3457, AbstractC1697.m3510(interfaceC0705M5588, false, (InterfaceC4745) objM89912), 0L, c5362, 0);
                                    c5362.m9009(false);
                                }
                            } else {
                                c5362.m8982();
                            }
                            C5863 c5863M8965 = c5362.m8965();
                            if (c5863M8965 != null) {
                                c5863M8965.f19365 = new C4164(i, i2, c3635);
                            }
                        }

                        /* JADX INFO: renamed from: ۦؒ */
                        public static int m5235(float f) {
                            if (!Float.isNaN(f)) {
                                return Math.round(f);
                            }
                            C1078.m2272("Cannot round NaN value.");
                            return 0;
                        }

                        /* JADX INFO: renamed from: ۦؖ */
                        public static final boolean m5236(int i) {
                            int type;
                            return (!m5238(i) || (type = Character.getType(i)) == 14 || type == 13 || i == 10) ? false : true;
                        }

                        /* JADX INFO: renamed from: ۦؗ */
                        public static List m5237(C0126 c0126, int i, C0126 c0127, boolean z, boolean z2, boolean z3) {
                            List list;
                            boolean z4;
                            int iM239 = c0126.m239(i);
                            int i2 = i + iM239;
                            int iM235 = c0126.m235(c0126.f490, c0126.m236(i));
                            int iM236 = c0126.m235(c0126.f490, c0126.m236(i2));
                            int i3 = iM236 - iM235;
                            boolean z5 = i >= 0 && (c0126.f490[(c0126.m236(i) * 5) + 1] & 201326592) != 0;
                            c0127.m267(iM239);
                            c0127.m243(i3, c0127.f488);
                            if (c0126.f501 < i2) {
                                c0126.m228(i2);
                            }
                            if (c0126.f500 < iM236) {
                                c0126.m249(iM236, i2);
                            }
                            int[] iArr = c0127.f490;
                            int i4 = c0127.f488;
                            int i5 = i4 * 5;
                            AbstractC0246.m523(i5, i * 5, i2 * 5, c0126.f490, iArr);
                            Object[] objArr = c0127.f482;
                            int i6 = c0127.f499;
                            System.arraycopy(c0126.f482, iM235, objArr, i6, i3);
                            int i7 = c0127.f503;
                            iArr[i5 + 2] = i7;
                            int i8 = i4 - i;
                            int i9 = i4 + iM239;
                            int iM237 = i6 - c0127.m235(iArr, i4);
                            int i10 = c0127.f495;
                            int i11 = c0127.f494;
                            int length = objArr.length;
                            boolean z6 = z5;
                            int i12 = i10;
                            int i13 = i4;
                            while (i13 < i9) {
                                if (i13 != i4) {
                                    int i14 = (i13 * 5) + 2;
                                    iArr[i14] = iArr[i14] + i8;
                                }
                                int[] iArr2 = iArr;
                                iArr2[(i13 * 5) + 4] = C0126.m227(c0127.m235(iArr, i13) + iM237, i12 < i13 ? 0 : c0127.f500, i11, length);
                                if (i13 == i12) {
                                    i12++;
                                }
                                i13++;
                                i4 = i4;
                                iArr = iArr2;
                            }
                            int[] iArr3 = iArr;
                            c0127.f495 = i12;
                            int iM6811 = AbstractC3809.m6811(c0126.f493, i, c0126.m271());
                            int iM6812 = AbstractC3809.m6811(c0126.f493, i2, c0126.m271());
                            if (iM6811 < iM6812) {
                                ArrayList arrayList = c0126.f493;
                                ArrayList arrayList2 = new ArrayList(iM6812 - iM6811);
                                for (int i15 = iM6811; i15 < iM6812; i15++) {
                                    C4356 c4356 = (C4356) arrayList.get(i15);
                                    c4356.f14359 += i8;
                                    arrayList2.add(c4356);
                                }
                                c0127.f493.addAll(AbstractC3809.m6811(c0127.f493, c0127.f488, c0127.m271()), arrayList2);
                                arrayList.subList(iM6811, iM6812).clear();
                                list = arrayList2;
                            } else {
                                list = C2340.f7777;
                            }
                            if (!list.isEmpty()) {
                                HashMap map = c0126.f484;
                                HashMap map2 = c0127.f484;
                                if (map != null && map2 != null) {
                                    int size = list.size();
                                    for (int i16 = 0; i16 < size; i16++) {
                                    }
                                }
                            }
                            int i17 = c0127.f503;
                            c0127.m268(i7);
                            int iM262 = c0126.m262(c0126.f490, i);
                            if (!z3) {
                                z4 = false;
                            } else if (z) {
                                boolean z7 = iM262 >= 0;
                                if (z7) {
                                    c0126.m270();
                                    c0126.m246(iM262 - c0126.f488);
                                    c0126.m270();
                                }
                                c0126.m246(i - c0126.f488);
                                boolean zM254 = c0126.m254();
                                if (z7) {
                                    c0126.m260();
                                    c0126.m263();
                                    c0126.m260();
                                    c0126.m263();
                                }
                                z4 = zM254;
                            } else {
                                boolean zM252 = c0126.m252(i, iM239);
                                c0126.m248(iM235, i3, i - 1);
                                z4 = zM252;
                            }
                            if (z4) {
                                AbstractC5508.m9201("Unexpectedly removed anchors");
                            }
                            int i18 = c0127.f505;
                            int i19 = iArr3[i5 + 1];
                            c0127.f505 = i18 + ((1073741824 & i19) != 0 ? 1 : i19 & 67108863);
                            if (z2) {
                                c0127.f488 = i9;
                                c0127.f499 = i6 + i3;
                            }
                            if (z6) {
                                c0127.m251(i7);
                            }
                            return list;
                        }

                        /* JADX INFO: renamed from: ۦؙ */
                        public static final boolean m5238(int i) {
                            return Character.isWhitespace(i) || i == 160;
                        }

                        /* JADX INFO: renamed from: ۦؚ */
                        public static final void m5239(C5837 c5837) {
                            C2829 c2829 = c5837.f19223;
                            if (c2829 != null) {
                                c5837.f19244.mo211(C5745.m9570((C5745) c5837.f19234.f16551, null, 0L, 3));
                                C1568 c1568 = c2829.f9447;
                                AtomicReference atomicReference = c1568.f5284;
                                while (!atomicReference.compareAndSet(c2829, null)) {
                                    if (atomicReference.get() != c2829) {
                                    }
                                }
                                c1568.f5285.mo3444();
                            }
                            c5837.f19223 = null;
                        }

                        /* JADX INFO: renamed from: ۦٌ */
                        public static boolean m5240(Object obj, Object obj2) {
                            if (obj != obj2) {
                                return obj != null && obj.equals(obj2);
                            }
                            return true;
                        }

                        /* JADX INFO: renamed from: ۦُ */
                        public static final void m5241(C5837 c5837, C5745 c5745, InterfaceC4120 interfaceC4120) {
                            AbstractC3191 abstractC3191M7473 = AbstractC4225.m7473();
                            InterfaceC4745 interfaceC4745Mo4945 = abstractC3191M7473 != null ? abstractC3191M7473.mo4945() : null;
                            AbstractC3191 abstractC3191M7452 = AbstractC4225.m7452(abstractC3191M7473);
                            try {
                                C2449 c2449M9648 = c5837.m9648();
                                if (c2449M9648 == null) {
                                    return;
                                }
                                C2829 c2829 = c5837.f19223;
                                if (c2829 == null) {
                                    return;
                                }
                                InterfaceC2015 interfaceC2015M9643 = c5837.m9643();
                                if (interfaceC2015M9643 == null) {
                                    return;
                                }
                                AbstractC0949.m1946(c5745, c5837.f19232, c2449M9648.f8158, interfaceC2015M9643, c2829, c5837.m9646(), interfaceC4120);
                            } finally {
                                AbstractC4225.m7466(abstractC3191M7473, abstractC3191M7452, interfaceC4745Mo4945);
                            }
                        }

                        /* JADX INFO: renamed from: ۦِ */
                        public static C1007 m5242(String str) {
                            if (str.length() % 2 != 0) {
                                C1078.m2273("Unexpected hex string: ".concat(str));
                                return null;
                            }
                            int length = str.length() / 2;
                            byte[] bArr = new byte[length];
                            for (int i = 0; i < length; i++) {
                                int i2 = i * 2;
                                bArr[i] = (byte) (AbstractC2133.m4149(str.charAt(i2 + 1)) + (AbstractC2133.m4149(str.charAt(i2)) << 4));
                            }
                            return new C1007(bArr);
                        }

                        /* JADX INFO: renamed from: ۦٕ */
                        public static final long m5243(C5837 c5837, C2793 c2793, int i) {
                            C0178 c0178 = C1298.f4441;
                            C2449 c2449M9648 = c5837.m9648();
                            C2276 c2276 = c2449M9648 != null ? c2449M9648.f8158.f12696 : null;
                            InterfaceC2015 interfaceC2015M9643 = c5837.m9643();
                            return (c2276 == null || interfaceC2015M9643 == null) ? C3346.f11196 : c2276.m4333(c2793.m5323(interfaceC2015M9643.mo2782(0L)), i, c0178);
                        }

                        /* JADX INFO: renamed from: ۦٗ */
                        public static final int m5244(C2276 c2276, long j, InterfaceC2509 interfaceC2509) {
                            float fMo3254 = interfaceC2509 != null ? interfaceC2509.mo3254() : 0.0f;
                            int i = (int) (4294967295L & j);
                            int iM4330 = c2276.m4330(Float.intBitsToFloat(i));
                            if (Float.intBitsToFloat(i) < c2276.m4331(iM4330) - fMo3254 || Float.intBitsToFloat(i) > c2276.m4332(iM4330) + fMo3254) {
                                return -1;
                            }
                            int i2 = (int) (j >> 32);
                            if (Float.intBitsToFloat(i2) < (-fMo3254) || Float.intBitsToFloat(i2) > c2276.f7564 + fMo3254) {
                                return -1;
                            }
                            return iM4330;
                        }

                        /* JADX INFO: renamed from: ۦٚ */
                        public static final boolean m5245(C3129 c3129) {
                            AbstractC1311 abstractC1311M5765 = c3129.m5765();
                            C3262 c3262 = c3129.f10476.f8490;
                            return (abstractC1311M5765 != null ? abstractC1311M5765.m9792() : false) || c3262.m6015(AbstractC2771.f9202) || c3262.m6015(AbstractC2771.f9234);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX INFO: renamed from: ۦٛ */
                        public static InterfaceC0443 m5246(InterfaceC0443 interfaceC0443, InterfaceC0443 interfaceC0444, InterfaceC5731 interfaceC5731) {
                            if (interfaceC5731 instanceof AbstractC2870) {
                                return ((AbstractC2870) interfaceC5731).mo217(interfaceC0444, interfaceC0443);
                            }
                            InterfaceC3534 interfaceC3534Mo334 = interfaceC0444.mo334();
                            return interfaceC3534Mo334 == C4794.f15814 ? new C5538(interfaceC0444, interfaceC0443, interfaceC5731) : new C2910(interfaceC0444, interfaceC3534Mo334, interfaceC5731, interfaceC0443);
                        }

                        /* JADX INFO: renamed from: ۦۗ */
                        public static C1007 m5247(String str) {
                            C1007 c1007 = new C1007(str.getBytes(AbstractC4637.f15306));
                            c1007.f3596 = str;
                            return c1007;
                        }

                        /* JADX INFO: renamed from: ۦۚ */
                        public static final C4912 m5248(C5505 c5505, InterfaceC4745 interfaceC4745) {
                            Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
                            try {
                                C3129 c3129M9199 = c5505.m9199();
                                C0605 c0605 = c3129M9199.f10471;
                                if (c0605.m1342() && c0605.m1348()) {
                                    C2793 c2793M5770 = c3129M9199.m5770();
                                    C4912 c4912 = new C4912(48);
                                    C3121 c3121 = new C3121(17, (byte) 0);
                                    c3121.m5740(AbstractC2765.m5141(c2793M5770));
                                    m5216(interfaceC4745, new C3121(17, (byte) 0), c3121, c4912, c3129M9199, c3129M9199);
                                    return c4912;
                                }
                                return AbstractC0137.f547;
                            } finally {
                                Trace.endSection();
                            }
                        }

                        /* JADX INFO: renamed from: ۦۛ */
                        public static final int m5249(C5837 c5837, long j, InterfaceC2509 interfaceC2509) {
                            long jMo2782;
                            int iM5244;
                            C2449 c2449M9648 = c5837.m9648();
                            if (c2449M9648 != null) {
                                C2276 c2276 = c2449M9648.f8158.f12696;
                                InterfaceC2015 interfaceC2015M9643 = c5837.m9643();
                                if (interfaceC2015M9643 != null && (iM5244 = m5244(c2276, (jMo2782 = interfaceC2015M9643.mo2782(j)), interfaceC2509)) != -1) {
                                    return c2276.m4339(C1553.m3307(jMo2782, (c2276.m4332(iM5244) + c2276.m4331(iM5244)) / 2.0f, 1));
                                }
                            }
                            return -1;
                        }

                        /* JADX INFO: renamed from: ۦۜ */
                        public static void m5250(C4992 c4992) {
                            C4994 c4994;
                            C5909 c5909;
                            C5909 c59010;
                            do {
                                c4994 = C0469.f1692;
                                c5909 = (C5909) c4994.getValue();
                                C0588 c0588M1299 = c5909.f19494;
                                C0167 c0167 = (C0167) c0588M1299.get(c4992);
                                if (c0167 == null) {
                                    c59010 = c5909;
                                } else {
                                    Object obj = c0167.f627;
                                    Object obj2 = c0167.f626;
                                    C1205 c1205 = c0588M1299.f2193;
                                    C1205 c1205M2550 = c1205.m2550(c4992 != null ? c4992.hashCode() : 0, 0, c4992);
                                    if (c1205 != c1205M2550) {
                                        c0588M1299 = c1205M2550 == null ? C0588.f2191 : new C0588(c1205M2550, c0588M1299.f2192 - 1);
                                    }
                                    C0373 c0373 = C0373.f1371;
                                    if (obj != c0373) {
                                        c0588M1299 = c0588M1299.m1299(obj, new C0167(((C0167) c0588M1299.get(obj)).f627, obj2));
                                    }
                                    if (obj2 != c0373) {
                                        c0588M1299 = c0588M1299.m1299(obj2, new C0167(obj, ((C0167) c0588M1299.get(obj2)).f626));
                                    }
                                    Object obj3 = obj != c0373 ? c5909.f19496 : obj2;
                                    if (obj2 != c0373) {
                                        obj = c5909.f19495;
                                    }
                                    c59010 = new C5909(obj3, obj, c0588M1299);
                                }
                                if (c5909 == c59010) {
                                    return;
                                }
                            } while (!c4994.m8386(c5909, c59010));
                        }

                        /* JADX INFO: renamed from: ۦ۟ */
                        public static final void m5251(C4912 c4912, C3129 c3129, C3129 c31210) {
                            C0605 c0605;
                            C3129 c3129M5766 = c31210.m5766();
                            C2793 c2793M5770 = (c3129M5766 == null || (c0605 = c3129M5766.f10471) == null || !c0605.m1342()) ? f9253 : c3129M5766.m5770();
                            int i = c31210.f10473;
                            if (i == c3129.f10473) {
                                i = -1;
                            }
                            c4912.m8319(i, new C1307(c31210, AbstractC2765.m5141(c2793M5770)));
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        /* JADX INFO: renamed from: ۦ۠ */
                        public static final Object m5252(long j, InterfaceC5731 interfaceC5731, AbstractC0772 abstractC0772) {
                            C5644 c5644;
                            C5450 c5450;
                            if (abstractC0772 instanceof C5644) {
                                c5644 = (C5644) abstractC0772;
                                int i = c5644.f18596;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    c5644.f18596 = i - Integer.MIN_VALUE;
                                } else {
                                    c5644 = new C5644(abstractC0772);
                                }
                            } else {
                                c5644 = new C5644(abstractC0772);
                            }
                            Object obj = c5644.f18594;
                            int i2 = c5644.f18596;
                            if (i2 == 0) {
                                AbstractC0186.m409(obj);
                                if (j > 0) {
                                    C5450 c5451 = new C5450();
                                    try {
                                        c5644.f18595 = c5451;
                                        c5644.f18596 = 1;
                                        RunnableC1491 runnableC1491 = new RunnableC1491(j, c5644);
                                        c5451.f17965 = runnableC1491;
                                        Object objM5213 = m5213(runnableC1491, interfaceC5731);
                                        EnumC2282 enumC2282 = EnumC2282.f7590;
                                        return objM5213 == enumC2282 ? enumC2282 : objM5213;
                                    } catch (C4862 e) {
                                        e = e;
                                        c5450 = c5451;
                                    }
                                }
                                return null;
                            }
                            if (i2 != 1) {
                                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            c5450 = c5644.f18595;
                            try {
                                AbstractC0186.m409(obj);
                                return obj;
                            } catch (C4862 e2) {
                                e = e2;
                            }
                            if (e.f15991 != c5450.f17965) {
                                throw e;
                            }
                            return null;
                        }

                        /* JADX INFO: renamed from: ۦۣ */
                        public static TypedValue m5253(Resources.Theme theme, int i) {
                            TypedValue typedValue = new TypedValue();
                            if (theme.resolveAttribute(i, typedValue, true)) {
                                return typedValue;
                            }
                            return null;
                        }

                        /* JADX INFO: renamed from: ۦۧ */
                        public static int m5254(int i, int i2, String str) {
                            return (int) m5227(str, i, 1L, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
                        }

                        /* JADX INFO: renamed from: ۦۨ */
                        public static final void m5255(InterfaceC4745 interfaceC4745, C3121 c3121, C3121 c3122, C4912 c4912, C3129 c3129, C3129 c31210) {
                            C3121 c3123 = c3121;
                            Region region = (Region) c3123.f10451;
                            C3121 c3124 = c3122;
                            Region region2 = (Region) c3124.f10451;
                            C0605 c0605 = c31210.f10471;
                            C0605 c0606 = c31210.f10471;
                            if (!c0605.m1342() || !c0606.m1348() || region2.isEmpty()) {
                                if (c31210.m5771()) {
                                    m5251(c4912, c3129, c31210);
                                    return;
                                }
                                return;
                            }
                            C2793 c2793M5767 = c31210.m5767();
                            if (c2793M5767.m5318()) {
                                Object objM5759 = c31210.m5759();
                                if (objM5759 == null) {
                                    C2935 c2935 = (C2935) c0606.f2256.f8206;
                                    c2793M5767 = C4773.m8145(c2935).mo2794(c2935, false);
                                } else {
                                    AbstractC5381 abstractC5381 = ((AbstractC5381) objM5759).f17791;
                                    Object objM6027 = c31210.f10476.f8490.m6027(AbstractC0208.f772);
                                    if (objM6027 == null) {
                                        objM6027 = null;
                                    }
                                    boolean z = objM6027 != null;
                                    if (!abstractC5381.f17791.f17786) {
                                        c2793M5767 = C2793.f9340;
                                    } else if (z) {
                                        c2793M5767 = AbstractC5537.m9245(abstractC5381, 8).m9775();
                                    } else {
                                        AbstractC1311 abstractC1311M9245 = AbstractC5537.m9245(abstractC5381, 8);
                                        c2793M5767 = C4773.m8145(abstractC1311M9245).mo2794(abstractC1311M9245, false);
                                    }
                                }
                            }
                            C4730 c4730M5141 = AbstractC2765.m5141(c2793M5767);
                            c3123.m5740(c4730M5141);
                            if (region.op(region2, Region.Op.INTERSECT)) {
                                int i = c31210.f10473;
                                C3129 c31211 = c3129;
                                if (i == c31211.f10473) {
                                    i = -1;
                                }
                                Rect bounds = region.getBounds();
                                C1307 c1307 = new C1307(c31210, new C4730(bounds.left, bounds.top, bounds.right, bounds.bottom));
                                C4912 c4913 = c4912;
                                c4913.m8319(i, c1307);
                                List listM5756 = C3129.m5756(4, c31210);
                                int size = listM5756.size() - 1;
                                while (-1 < size) {
                                    if (!((Boolean) interfaceC4745.mo211(listM5756.get(size))).booleanValue()) {
                                        m5255(interfaceC4745, c3123, c3124, c4913, c31211, (C3129) listM5756.get(size));
                                    }
                                    size--;
                                    c3123 = c3121;
                                    c3124 = c3122;
                                    c4913 = c4912;
                                    c31211 = c3129;
                                }
                                if (m5218(c31210)) {
                                    region2.op(c4730M5141.f15612, c4730M5141.f15611, c4730M5141.f15610, c4730M5141.f15613, Region.Op.DIFFERENCE);
                                }
                            }
                        }

                        /* JADX INFO: renamed from: ۥؔ */
                        public abstract void mo4350(C0060 c0060, Thread thread);

                        /* JADX INFO: renamed from: ۥؖ */
                        public abstract float mo2267(C3472 c3472);

                        /* JADX INFO: renamed from: ۥَ */
                        public abstract C3510 mo4990();

                        /* JADX INFO: renamed from: ۥُ */
                        public abstract boolean mo4351(AbstractC0065 abstractC0065, C0085 c0085, C0085 c0086);

                        /* JADX INFO: renamed from: ۥّ */
                        public abstract boolean mo4352(AbstractC0065 abstractC0065, Object obj, Object obj2);

                        /* JADX INFO: renamed from: ۥٖ */
                        public Object m5256(int i) {
                            Object objMo211;
                            C4014 c4014M6296 = mo4990().m6296(i);
                            int i2 = i - c4014M6296.f13382;
                            InterfaceC4745 key = c4014M6296.f13380.getKey();
                            return (key == null || (objMo211 = key.mo211(Integer.valueOf(i2))) == null) ? new C2184(i) : objMo211;
                        }

                        /* JADX INFO: renamed from: ۥ۟ */
                        public abstract void mo2268(C3472 c3472, float f);

                        /* JADX INFO: renamed from: ۦٖ */
                        public abstract void mo4353(C0060 c0060, C0060 c0061);

                        /* JADX INFO: renamed from: ۦۙ */
                        public abstract boolean mo4354(AbstractC0065 abstractC0065, C0060 c0060, C0060 c0061);
                    }
