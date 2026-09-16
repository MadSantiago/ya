package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.PorterDuff;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import ru.bluecat.yandexmapspatcher.R;
import ru.bluecat.yandexmapspatcher.p003ui.App;

/* JADX INFO: renamed from: ۥۦؑٔؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2774 {

    /* JADX INFO: renamed from: ۥؗ */
    public static Context f9240 = null;

    /* JADX INFO: renamed from: ۥّ */
    public static final C2274 f9242;

    /* JADX INFO: renamed from: ۥۗ */
    public static int f9243 = -1;

    /* JADX INFO: renamed from: ۥۜ */
    public static C3963 f9244;

    /* JADX INFO: renamed from: ۥۣ */
    public static Class f9245;

    /* JADX INFO: renamed from: ۦٛ */
    public static C4452 f9247;

    /* JADX INFO: renamed from: ۦۙ */
    public static final C2274[] f9248;

    /* JADX INFO: renamed from: ۦؑ */
    public static final StackTraceElement[] f9246 = new StackTraceElement[0];

    /* JADX INFO: renamed from: ۥُ */
    public static final C4619 f9241 = new C4619(0, new long[0], new Object[0]);

    static {
        C2274 c2274 = new C2274(1L, "CLIENT_TELEMETRY", false, -1);
        f9242 = c2274;
        f9248 = new C2274[]{c2274};
    }

    /* JADX INFO: renamed from: ۥؓ */
    public static PorterDuff.Mode m5172(int i) {
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i != 5) {
            if (i == 9) {
                return PorterDuff.Mode.SRC_ATOP;
            }
            switch (i) {
                case 14:
                    return PorterDuff.Mode.MULTIPLY;
                case 15:
                    return PorterDuff.Mode.SCREEN;
                case 16:
                    return PorterDuff.Mode.ADD;
            }
        }
        return mode;
    }

    /* JADX INFO: renamed from: ۥؖ */
    public static final InterfaceC3534 m5173(InterfaceC4643 interfaceC4643, InterfaceC3534 interfaceC3534) {
        InterfaceC3534 interfaceC3534M5208 = m5208(interfaceC4643.mo1586(), interfaceC3534, true);
        C0649 c0649 = AbstractC0912.f3276;
        return (interfaceC3534M5208 == c0649 || interfaceC3534M5208.mo865(C0373.f1369) != null) ? interfaceC3534M5208 : interfaceC3534M5208.mo860(c0649);
    }

    /* JADX WARN: Code duplicated, block: B:173:0x0299  */
    /* JADX INFO: renamed from: ۥؗ */
    public static final void m5174(int i, int i2, C2851 c2851, InterfaceC3195 interfaceC3195, C1911 c1911, InterfaceC0738 interfaceC0738, InterfaceC4745 interfaceC4745, C5362 c5362, C0846 c0846, InterfaceC0705 interfaceC0705, InterfaceC1291 interfaceC1291, boolean z) {
        int i3;
        int i4;
        InterfaceC4745 interfaceC4746;
        C0846 c0847;
        boolean z2;
        Object c3934;
        C0846 c0848;
        boolean z3;
        InterfaceC3602 interfaceC3602;
        InterfaceC0705 interfaceC0705M4141;
        c5362.m8979(924924659);
        if ((i & 6) == 0) {
            i3 = (c5362.m8963(interfaceC0705) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c5362.m8963(c0846) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= c5362.m8963(interfaceC1291) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= c5362.m9006(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= c5362.m9006(true) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= c5362.m8963(interfaceC0738) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= c5362.m9006(z) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= c5362.m8963(c2851) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= c5362.m8963(c1911) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (c5362.m8963(interfaceC3195) ? 4 : 2);
        } else {
            i4 = i2;
        }
        int i5 = i4 | 432;
        if ((i2 & 3072) == 0) {
            interfaceC4746 = interfaceC4745;
            i5 |= c5362.m8977(interfaceC4746) ? 2048 : 1024;
        } else {
            interfaceC4746 = interfaceC4745;
        }
        if (c5362.m9011(i3 & 1, ((i3 & 306783379) == 306783378 && (i5 & 1171) == 1170) ? false : true)) {
            c5362.m8971();
            if ((i & 1) != 0 && !c5362.m8969()) {
                c5362.m8982();
            }
            int i6 = i3 & (-234881025);
            c5362.m8964();
            int i7 = i6 >> 3;
            int i8 = i7 & 14;
            int i9 = i8 | ((i5 >> 6) & 112);
            InterfaceC4367 interfaceC4367M5175 = m5175(interfaceC4745, c5362);
            boolean z4 = (((i9 & 14) ^ 6) > 4 && c5362.m8963(c0846)) || (i9 & 6) == 4;
            Object objM8999 = c5362.m8999();
            Object obj = C2850.f9517;
            if (z4 || objM8999 == obj) {
                C4068 c4068 = new C4068();
                c4068.f13546 = new C0169(Integer.MAX_VALUE);
                c4068.f13545 = new C0169(Integer.MAX_VALUE);
                C1397 c1397 = C1397.f4792;
                int i10 = 9;
                C0681 c0681 = new C0681(interfaceC4367M5175, i10);
                C5460 c5460 = AbstractC3004.f10103;
                objM8999 = new C2589(0, 1, InterfaceC5372.class, new C5704(new C1597(new C5704(c0681, c1397), c0846, c4068, i10), c1397), "value", "getValue()Ljava/lang/Object;");
                c5362.m8987(objM8999);
            }
            InterfaceC3602 interfaceC3603 = (InterfaceC3602) objM8999;
            int i11 = i6 >> 9;
            int i12 = i8 | (i11 & 112);
            boolean z5 = ((((i12 & 112) ^ 48) > 32 && c5362.m9006(true)) || (i12 & 48) == 32) | ((((i12 & 14) ^ 6) > 4 && c5362.m8963(c0846)) || (i12 & 6) == 4);
            Object objM89910 = c5362.m8999();
            if (z5 || objM89910 == obj) {
                objM89910 = new C5332(c0846);
                c5362.m8987(objM89910);
            }
            InterfaceC5635 interfaceC5635 = (InterfaceC5635) objM89910;
            Object objM89911 = c5362.m8999();
            if (objM89911 == obj) {
                objM89911 = AbstractC3925.m7061(c5362);
                c5362.m8987(objM89911);
            }
            InterfaceC4643 interfaceC4643 = (InterfaceC4643) objM89911;
            InterfaceC5449 interfaceC5449 = (InterfaceC5449) c5362.m8997(AbstractC2853.f9554);
            C4036 c4036 = !((Boolean) c5362.m8997(AbstractC2853.f9542)).booleanValue() ? C5098.f16894 : null;
            int i13 = i5 << 18;
            int i14 = (i6 & 65520) | (i11 & 3670016) | (i13 & 29360128) | (i13 & 234881024) | ((i5 << 27) & 1879048192);
            boolean z6 = ((((i14 & 112) ^ 48) > 32 && c5362.m8963(c0846)) || (i14 & 48) == 32) | ((((i14 & 896) ^ 384) > 256 && c5362.m8963(interfaceC1291)) || (i14 & 384) == 256) | ((((i14 & 7168) ^ 3072) > 2048 && c5362.m9006(false)) || (i14 & 3072) == 2048);
            if (((57344 & i14) ^ 24576) > 16384 && c5362.m9006(true)) {
                z2 = true;
            } else if ((i14 & 24576) == 16384) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean zM8988 = z6 | z2 | c5362.m8988(0) | ((((i14 & 3670016) ^ 1572864) > 1048576 && c5362.m8963(c1911)) || (i14 & 1572864) == 1048576) | (((i14 & 29360128) ^ 12582912) > 8388608 && c5362.m8963(null)) | (((i14 & 234881024) ^ 100663296) > 67108864 && c5362.m8963(null)) | ((((i14 & 1879048192) ^ 805306368) > 536870912 && c5362.m8963(interfaceC3195)) || (i14 & 805306368) == 536870912) | c5362.m8963(interfaceC5449) | c5362.m8963(c4036);
            Object objM89912 = c5362.m8999();
            if (zM8988 || objM89912 == obj) {
                c0848 = c0846;
                z3 = true;
                c3934 = new C3934(c0848, interfaceC1291, interfaceC3603, interfaceC3195, interfaceC4643, interfaceC5449, c4036, c1911);
                interfaceC3602 = interfaceC3603;
                c5362.m8987(c3934);
            } else {
                c3934 = objM89912;
                interfaceC3602 = interfaceC3603;
                z3 = true;
                c0848 = c0846;
            }
            InterfaceC5572 interfaceC5572 = (InterfaceC5572) c3934;
            EnumC1616 enumC1616 = EnumC1616.f5425;
            if (z) {
                c5362.m8957(-2077147368);
                if ((((i7 & 14) ^ 6) <= 4 || !c5362.m8963(c0846)) && (i7 & 6) != 4) {
                    z3 = false;
                }
                boolean zM8989 = z3 | c5362.m8988(0);
                Object objM89913 = c5362.m8999();
                if (zM8989 || objM89913 == obj) {
                    objM89913 = new C2375(c0848);
                    c5362.m8987(objM89913);
                }
                interfaceC0705M4141 = AbstractC2133.m4141((C2375) objM89913, c0848.f3040, enumC1616);
                c5362.m9009(false);
            } else {
                c5362.m8957(-2076718545);
                c5362.m9009(false);
                interfaceC0705M4141 = C4217.f13994;
            }
            c0847 = c0848;
            AbstractC5568.m9351(interfaceC3602, AbstractC3933.m7085(AbstractC2552.m4804(interfaceC0705.mo1571(c0848.f3030).mo1571(c0848.f3031), interfaceC3602, interfaceC5635, enumC1616, z).mo1571(interfaceC0705M4141).mo1571((InterfaceC0705) c0848.f3037.f1729), c0848, enumC1616, c2851, z, interfaceC0738, c0848.f3036, null), c0847.f3039, interfaceC5572, c5362, 0);
        } else {
            c0847 = c0846;
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C1026(interfaceC0705, c0847, interfaceC1291, interfaceC0738, z, c2851, c1911, interfaceC3195, interfaceC4746, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۥً */
    public static final InterfaceC4367 m5175(Object obj, C5362 c5362) {
        Object objM8999 = c5362.m8999();
        if (objM8999 == C2850.f9517) {
            objM8999 = m5183(obj);
            c5362.m8987(objM8999);
        }
        InterfaceC4367 interfaceC4367 = (InterfaceC4367) objM8999;
        interfaceC4367.setValue(obj);
        return interfaceC4367;
    }

    /* JADX INFO: renamed from: ۥَ */
    public static Context m5176() {
        if (f9240 == null) {
            try {
                Context baseContext = (Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", null).invoke(null, null);
                while (baseContext instanceof ContextWrapper) {
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                }
                f9240 = baseContext;
            } catch (Exception e) {
                m5205("LIBSU", e);
            }
        }
        return f9240;
    }

    /* JADX INFO: renamed from: ۥُ */
    public static int m5177(int i, int i2) {
        return (i & 16777215) | (i2 << 24);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0058 A[LOOP:0: B:19:0x0049->B:23:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: ۥّ */
    public static final java.lang.Object m5178(p000.C5475 r6, p000.AbstractC2870 r7) {
        /*
            boolean r0 = r7 instanceof p000.C0901
            if (r0 == 0) goto L13
            r0 = r7
            ۥٌْؕۧ r0 = (p000.C0901) r0
            int r1 = r0.f3243
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3243 = r1
            goto L18
        L13:
            ۥٌْؕۧ r0 = new ۥٌْؕۧ
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f3241
            int r1 = r0.f3243
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            ۦٜٖۡؕ r6 = r0.f3242
            p000.AbstractC0186.m409(r7)
            goto L40
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1078.m2276(r6)
            r6 = 0
            return r6
        L2e:
            p000.AbstractC0186.m409(r7)
        L31:
            r0.f3242 = r6
            r0.f3243 = r2
            ۦَِؒۖ r7 = p000.EnumC3834.f12724
            java.lang.Object r7 = r6.m9172(r7, r0)
            ۥٟۚؕۨ r1 = p000.EnumC2282.f7590
            if (r7 != r1) goto L40
            return r1
        L40:
            ۦۤؑۗٛ r7 = (p000.C5639) r7
            java.util.List r1 = r7.f18583
            int r3 = r1.size()
            r4 = 0
        L49:
            if (r4 >= r3) goto L5b
            java.lang.Object r5 = r1.get(r4)
            ۦؙؓۘ r5 = (p000.C3536) r5
            boolean r5 = p000.AbstractC3801.m6793(r5)
            if (r5 != 0) goto L58
            goto L31
        L58:
            int r4 = r4 + 1
            goto L49
        L5b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC2774.m5178(ۦٜٖۡؕ, ۥۧؔۡؗ):java.lang.Object");
    }

    /* JADX INFO: renamed from: ۥْ */
    public static C3632 m5179(float f, float f2, float f3) {
        C4069 c4069 = C4069.f13547;
        float f4 = c4069.f13556 * f2;
        Math.sqrt(((f2 / ((float) Math.sqrt(((double) f) / 100.0d))) * c4069.f13549) / (c4069.f13551 + 4.0f));
        float f5 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float fLog = ((float) Math.log((((double) f4) * 0.0228d) + 1.0d)) * 43.85965f;
        double d = (3.1415927f * f3) / 180.0f;
        return new C3632(f3, f2, f, f5, fLog * ((float) Math.cos(d)), fLog * ((float) Math.sin(d)));
    }

    /* JADX INFO: renamed from: ۥٓ */
    public static final ArrayList m5180(InterfaceC0151 interfaceC0151) {
        C0605 c0605Mo2790 = ((AbstractC3625) interfaceC0151).mo2790();
        boolean zM5200 = m5200(c0605Mo2790);
        C3482 c3482 = (C3482) c0605Mo2790.m1368();
        C0863 c0863 = (C0863) c3482.f11560;
        ArrayList arrayList = new ArrayList(c0863.f3180);
        int i = c0863.f3180;
        for (int i2 = 0; i2 < i; i2++) {
            C0605 c0605 = (C0605) c3482.get(i2);
            arrayList.add(zM5200 ? c0605.m1351() : c0605.m1352());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۥٕ */
    public static final String m5181(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    /* JADX INFO: renamed from: ۥٖ */
    public static boolean m5182() {
        try {
            if (ViewTreeObserverOnGlobalLayoutListenerC0850.f19551 == null) {
                ViewTreeObserverOnGlobalLayoutListenerC0850.f19551 = Class.forName("android.os.SystemProperties");
            }
            Method declaredMethod = ViewTreeObserverOnGlobalLayoutListenerC0850.f19556;
            if (declaredMethod == null) {
                Class cls = ViewTreeObserverOnGlobalLayoutListenerC0850.f19551;
                declaredMethod = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                ViewTreeObserverOnGlobalLayoutListenerC0850.f19556 = declaredMethod;
            }
            Object objInvoke = declaredMethod != null ? declaredMethod.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return AbstractC3831.m6874(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۥٙ */
    public static C4852 m5183(Object obj) {
        return new C4852(obj, C1298.f4439);
    }

    /* JADX INFO: renamed from: ۥۖ */
    public static final C2796 m5184(C4992 c4992, String str, Executor executor, InterfaceC4448 interfaceC4448) {
        C2358 c2358 = C2358.f7817;
        C3543 c3543 = new C3543(0);
        C4206 c4206 = new C4206();
        c4206.f13965 = new C0914();
        C4995 c4995 = new C4995(c4206);
        c4206.f13966 = c4995;
        c4206.f13967 = AbstractC3761.class;
        try {
            executor.execute(new RunnableC3679(c4992, str, interfaceC4448, c3543, c4206));
            c4206.f13967 = c2358;
        } catch (Exception e) {
            c4995.f16533.mo1898(e);
        }
        return new C2796();
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static final void m5185(C1542 c1542, ArrayList arrayList, C5362 c5362, int i) {
        c5362.m8979(97564200);
        new C4441(new long[]{-3045716878208592969L, -6519910833000212925L, -8151926883547760069L, -4161308832248375796L, 7379206228348389957L, -9223282488626358944L, -7543491730276366396L, 949635194288378074L, 5031154401254016161L, 8286457361242467541L, -2810774258100159921L, 5631648935340977837L, -609515548840854660L, 4101388096570878678L, -3957188557370063992L, 1277928986839046529L, 8371650128084769571L}).toString();
        int i2 = (c5362.m8988(R.string.main_organization_title) ? 4 : 2) | i | (c5362.m8988(R.string.main_organization_summary) ? 32 : 16) | (c5362.m8988(R.string.organization_dialog_title) ? 256 : 128) | (c5362.m8977(c1542) ? 2048 : 1024) | (c5362.m8963(arrayList) ? 16384 : 8192);
        int i3 = 1;
        if (c5362.m9011(i2 & 1, (i2 & 9363) != 9362)) {
            int i4 = 7;
            new C4441(new long[]{-2572630180913474122L, -8933980314882127469L, 8104930984420017197L, -946870627158878056L, 1276738338870691532L, -1226588530020303567L, 9179261819404230403L}).toString();
            Object objM8999 = c5362.m8999();
            C4036 c4036 = C2850.f9517;
            if (objM8999 == c4036) {
                objM8999 = m5183(Boolean.FALSE);
                c5362.m8987(objM8999);
            }
            InterfaceC4367 interfaceC4367 = (InterfaceC4367) objM8999;
            new C4441(new long[]{-8884988370604306549L, 3259561071994574682L, 2684016627334643005L, -5322401823700746745L, 1676322615288786045L, 1267742076402138501L, -8215550020242228535L}).toString();
            Object objM89910 = c5362.m8999();
            int i5 = 6;
            if (objM89910 == c4036) {
                objM89910 = new C0681(interfaceC4367, i5);
                c5362.m8987(objM89910);
            }
            AbstractC1434.m3045(R.string.main_organization_title, R.string.main_organization_summary, null, (InterfaceC4448) objM89910, c5362, (i2 & 14) | 3072 | (i2 & 112), 4);
            if (((Boolean) interfaceC4367.getValue()).booleanValue()) {
                c5362.m8957(-1157430238);
                new C4441(new long[]{7064228759132888144L, 8265008326082912995L, -1439251203627990167L, -1630802676430608069L, 1715812616518375564L, -1260802818696275508L}).toString();
                C1347 c1347 = new C1347();
                App app = App.f407;
                C1443 c1443 = AbstractC2776.m5217().f409;
                Object obj = c1542.f5218;
                String str = c1542.f5219;
                boolean z = C1443.f4940;
                c1347.addAll((Set) c1443.m3068(obj, str));
                new C4441(new long[]{-8509076338884480091L, -6856512446150186980L, -3235214803519615296L, 3134373412798730645L, 5150063059493164929L, -3867943716653514105L, 1556523175644217040L}).toString();
                Object objM89911 = c5362.m8999();
                if (objM89911 == c4036) {
                    objM89911 = new C0681(interfaceC4367, i4);
                    c5362.m8987(objM89911);
                }
                AbstractC0186.m425((InterfaceC4448) objM89911, null, AbstractC3925.m7034(-455324454, new C3230(arrayList, c1347, c1542, interfaceC4367, 1), c5362), c5362, 390, 2);
                c5362.m9009(false);
            } else {
                c5362.m8957(-1155838822);
                c5362.m9009(false);
            }
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C1661(c1542, arrayList, i, i3);
        }
    }

    /* JADX INFO: renamed from: ۥۙ */
    public static final String m5186(String str) {
        int i = 0;
        int i2 = -1;
        if (!AbstractC0684.m1527(str, ":", false)) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i3 = 0; i3 < length; i3++) {
                    char cCharAt = lowerCase.charAt(i3);
                    if (AbstractC3831.m6879(cCharAt, 31) <= 0 || AbstractC3831.m6879(cCharAt, 127) >= 0 || AbstractC0684.m1521(cCharAt, 0, 6, " #%/:?@[\\]") != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressM5196 = (str.startsWith("[") && str.endsWith("]")) ? m5196(1, str.length() - 1, str) : m5196(0, str.length(), str);
        if (inetAddressM5196 == null) {
            return null;
        }
        byte[] address = inetAddressM5196.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return inetAddressM5196.getHostAddress();
            }
            throw new AssertionError(AbstractC5078.m8669('\'', "Invalid IPv6 address: '", str));
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < address.length) {
            int i6 = i4;
            while (i6 < 16 && address[i6] == 0 && address[i6 + 1] == 0) {
                i6 += 2;
            }
            int i7 = i6 - i4;
            if (i7 > i5 && i7 >= 4) {
                i2 = i4;
                i5 = i7;
            }
            i4 = i6 + 2;
        }
        C1270 c1270 = new C1270();
        while (i < address.length) {
            if (i == i2) {
                c1270.m2680(58);
                i += i5;
                if (i == 16) {
                    c1270.m2680(58);
                }
            } else {
                if (i > 0) {
                    c1270.m2680(58);
                }
                byte b = address[i];
                byte[] bArr = AbstractC4031.f13451;
                c1270.m2700(((b & 255) << 8) | (address[i + 1] & 255));
                i += 2;
            }
        }
        return c1270.m2669();
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static final InterfaceC0705 m5187(InterfaceC0705 interfaceC0705, C0489 c0489) {
        return interfaceC0705.mo1571(new C3478(c0489));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0057  */
    /* JADX WARN: Code duplicated, block: B:24:0x0059  */
    /* JADX WARN: Code duplicated, block: B:27:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    /* JADX WARN: Code duplicated, block: B:31:0x0082  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:48:0x0147  */
    /* JADX WARN: Code duplicated, block: B:49:0x014b  */
    /* JADX WARN: Code duplicated, block: B:51:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:54:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ۥۣ */
    public static final void m5188(C0379 c0379, C1347 c1347, InterfaceC1291 interfaceC1291, C5362 c5362, int i, int i2) {
        InterfaceC1291 c1393;
        boolean z;
        C5362 c5363;
        InterfaceC1291 interfaceC1292;
        C5863 c5863M8965;
        Object objM8999;
        C4036 c4036;
        boolean zBooleanValue;
        InterfaceC4745 interfaceC4745Mo357;
        boolean z2;
        boolean z3;
        boolean z4;
        Object objM89910;
        boolean z5;
        C0379 c03710;
        C3709 c3709;
        c5362.m8979(200413999);
        new C4441(new long[]{438342862117874963L, 7970030803230495246L, -208296075226528045L, -3441040954515580858L, 13453778398559098L, 2945574084893084497L, 7428434171470491826L, -599053193128399806L, -6594283361714598939L, -7921034072631457761L, 893861081084514085L, -607560767639749444L, -3915550428575038144L, -567588386725023367L, 5550658550236868867L, 2358835552928359130L, -9091649967398679752L}).toString();
        int i3 = (c5362.m8963(c0379) ? 4 : 2) | i | (c5362.m8963(c1347) ? 32 : 16);
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                c1393 = interfaceC1291;
                i3 |= c5362.m8963(c1393) ? 256 : 128;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (c5362.m9011(i3 & 1, z)) {
                if (i4 != 0) {
                    c1393 = new C1393(12.0f, 12.0f, 12.0f, 12.0f);
                }
                new C4441(new long[]{-4042822230553190180L, -7601356331535713734L, -18836468559717814L, -1297989541440573462L, 8083608006517244338L, -932819996080488982L, 4727212823701202255L}).toString();
                objM8999 = c5362.m8999();
                c4036 = C2850.f9517;
                if (objM8999 == c4036) {
                    objM8999 = m5183(Boolean.valueOf(c1347.contains(c0379.f1417)));
                    c5362.m8987(objM8999);
                }
                InterfaceC4367 interfaceC4367 = (InterfaceC4367) objM8999;
                zBooleanValue = ((Boolean) interfaceC4367.mo353()).booleanValue();
                interfaceC4745Mo357 = interfaceC4367.mo357();
                C4274 c4274 = C1298.f4423;
                C4182 c4182 = AbstractC4410.f14521;
                C2155 c2155 = new C2155(1);
                new C4441(new long[]{-5937637410893728123L, 7754130540755184111L, -466071690368542799L, -6086386159958856694L, -4656970013334784098L, 4563035076342238014L, -5689178493339936423L}).toString();
                boolean zM8963 = c5362.m8963(interfaceC4745Mo357) | c5362.m9006(zBooleanValue);
                if ((i3 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z6 = z2 | zM8963;
                if ((i3 & 14) == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = z6 | z3;
                objM89910 = c5362.m8999();
                if (!z4 || objM89910 == c4036) {
                    z5 = zBooleanValue;
                    C3316 c3316 = new C3316(1, interfaceC4745Mo357, c1347, c0379, z5);
                    c03710 = c0379;
                    c5362.m8987(c3316);
                    objM89910 = c3316;
                } else {
                    c03710 = c0379;
                    z5 = zBooleanValue;
                }
                InterfaceC0705 interfaceC0705M9215 = AbstractC5537.m9215(c4182, z5, c2155, (InterfaceC4745) objM89910, 10);
                new C4441(new long[]{-602256138572956223L, 2773966388435960030L, 6708954746649240990L, 4209944288997702289L, -7297204421533667181L, 560176630787801814L, 3636552669325213305L, 1874697007833260110L, -8987420002168313L, -745181538051416367L, -6293394696323213040L, -5289786041601186011L, 6117023314161858729L, -2741935381489328850L}).toString();
                C3668 c3668M6047 = AbstractC3287.m6047(AbstractC4225.f14014, c4274, c5362, 48);
                new C4441(new long[]{4806596260481959749L, 7219444797845822063L, 6173181991750909512L, 2446622544191900463L, -8903517186256235492L, 6341229470038018419L, 4140150238653383403L, 5005277257888523996L, 152412839962043727L, 4211312113850852476L, -3761420754371496630L, 8735124910380944203L}).toString();
                int iHashCode = Long.hashCode(c5362.f17657);
                C2103 c2103M8994 = c5362.m8994();
                InterfaceC0705 interfaceC0705M2161 = AbstractC0993.m2161(c5362, interfaceC0705M9215);
                InterfaceC4576.f15106.getClass();
                c3709 = C0849.f3049;
                new C4441(new long[]{6087501083926302722L, 3514375733273887886L, -1922552400969223560L, -6134836549361008752L, -8233994826921573677L, 3065559954981038028L, -8096795136443700799L, -1029979459875801472L, 8632119486012115160L, -6525298020756122312L, -7428531074624192242L, 4367296213417685929L}).toString();
                c5362.m8983();
                if (c5362.f17668) {
                    c5362.m9005(c3709);
                } else {
                    c5362.m8972();
                }
                AbstractC0993.m2127(C0849.f3048, c5362, c3668M6047);
                AbstractC0993.m2127(C0849.f3047, c5362, c2103M8994);
                AbstractC0993.m2127(C0849.f3053, c5362, Integer.valueOf(iHashCode));
                AbstractC0993.m2146(c5362, C0849.f3050);
                AbstractC0993.m2127(C0849.f3052, c5362, interfaceC0705M2161);
                new C4441(new long[]{-628987594340071332L, 5101819325604456315L, -2942834386827558832L, -7569358855968263258L, 4604811177590848138L}).toString();
                new C4441(new long[]{6671328117713527045L, -8684770575233171615L, -5495575644219208490L, -4625320774224387785L, -5375881409334696804L, -4583724862607125934L, 1103481807611644980L, -8893439860390996458L, 2675284259168166631L, -7228792075400884364L, 4223524356356528048L}).toString();
                C4773.m8132(z5, AbstractC5568.m9378(C4217.f13994, c1393), false, null, c5362, 48);
                AbstractC0495.m1105(C3133.m5804(c03710.f1416, c5362), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((C4413) c5362.m8997(AbstractC4957.f16399)).f14550, c5362, 0, 0, 131070);
                c5363 = c5362;
                c5363.m9009(true);
                interfaceC1292 = c1393;
            } else {
                c5363 = c5362;
                c5363.m8982();
                interfaceC1292 = c1393;
            }
            c5863M8965 = c5363.m8965();
            if (c5863M8965 != null) {
                c5863M8965.f19365 = new C2070(c0379, c1347, interfaceC1292, i, i2);
            }
        }
        i3 |= 384;
        c1393 = interfaceC1291;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (c5362.m9011(i3 & 1, z)) {
            if (i4 != 0) {
                c1393 = new C1393(12.0f, 12.0f, 12.0f, 12.0f);
            }
            new C4441(new long[]{-4042822230553190180L, -7601356331535713734L, -18836468559717814L, -1297989541440573462L, 8083608006517244338L, -932819996080488982L, 4727212823701202255L}).toString();
            objM8999 = c5362.m8999();
            c4036 = C2850.f9517;
            if (objM8999 == c4036) {
                objM8999 = m5183(Boolean.valueOf(c1347.contains(c0379.f1417)));
                c5362.m8987(objM8999);
            }
            InterfaceC4367 interfaceC4368 = (InterfaceC4367) objM8999;
            zBooleanValue = ((Boolean) interfaceC4368.mo353()).booleanValue();
            interfaceC4745Mo357 = interfaceC4368.mo357();
            C4274 c4275 = C1298.f4423;
            C4182 c4183 = AbstractC4410.f14521;
            C2155 c2156 = new C2155(1);
            new C4441(new long[]{-5937637410893728123L, 7754130540755184111L, -466071690368542799L, -6086386159958856694L, -4656970013334784098L, 4563035076342238014L, -5689178493339936423L}).toString();
            boolean zM8964 = c5362.m8963(interfaceC4745Mo357) | c5362.m9006(zBooleanValue);
            if ((i3 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z7 = z2 | zM8964;
            if ((i3 & 14) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            z4 = z7 | z3;
            objM89910 = c5362.m8999();
            if (z4) {
                z5 = zBooleanValue;
                C3316 c3317 = new C3316(1, interfaceC4745Mo357, c1347, c0379, z5);
                c03710 = c0379;
                c5362.m8987(c3317);
                objM89910 = c3317;
            } else {
                z5 = zBooleanValue;
                C3316 c3318 = new C3316(1, interfaceC4745Mo357, c1347, c0379, z5);
                c03710 = c0379;
                c5362.m8987(c3318);
                objM89910 = c3318;
            }
            InterfaceC0705 interfaceC0705M9216 = AbstractC5537.m9215(c4183, z5, c2156, (InterfaceC4745) objM89910, 10);
            new C4441(new long[]{-602256138572956223L, 2773966388435960030L, 6708954746649240990L, 4209944288997702289L, -7297204421533667181L, 560176630787801814L, 3636552669325213305L, 1874697007833260110L, -8987420002168313L, -745181538051416367L, -6293394696323213040L, -5289786041601186011L, 6117023314161858729L, -2741935381489328850L}).toString();
            C3668 c3668M6048 = AbstractC3287.m6047(AbstractC4225.f14014, c4275, c5362, 48);
            new C4441(new long[]{4806596260481959749L, 7219444797845822063L, 6173181991750909512L, 2446622544191900463L, -8903517186256235492L, 6341229470038018419L, 4140150238653383403L, 5005277257888523996L, 152412839962043727L, 4211312113850852476L, -3761420754371496630L, 8735124910380944203L}).toString();
            int iHashCode2 = Long.hashCode(c5362.f17657);
            C2103 c2103M8995 = c5362.m8994();
            InterfaceC0705 interfaceC0705M2162 = AbstractC0993.m2161(c5362, interfaceC0705M9216);
            InterfaceC4576.f15106.getClass();
            c3709 = C0849.f3049;
            new C4441(new long[]{6087501083926302722L, 3514375733273887886L, -1922552400969223560L, -6134836549361008752L, -8233994826921573677L, 3065559954981038028L, -8096795136443700799L, -1029979459875801472L, 8632119486012115160L, -6525298020756122312L, -7428531074624192242L, 4367296213417685929L}).toString();
            c5362.m8983();
            if (c5362.f17668) {
                c5362.m9005(c3709);
            } else {
                c5362.m8972();
            }
            AbstractC0993.m2127(C0849.f3048, c5362, c3668M6048);
            AbstractC0993.m2127(C0849.f3047, c5362, c2103M8995);
            AbstractC0993.m2127(C0849.f3053, c5362, Integer.valueOf(iHashCode2));
            AbstractC0993.m2146(c5362, C0849.f3050);
            AbstractC0993.m2127(C0849.f3052, c5362, interfaceC0705M2162);
            new C4441(new long[]{-628987594340071332L, 5101819325604456315L, -2942834386827558832L, -7569358855968263258L, 4604811177590848138L}).toString();
            new C4441(new long[]{6671328117713527045L, -8684770575233171615L, -5495575644219208490L, -4625320774224387785L, -5375881409334696804L, -4583724862607125934L, 1103481807611644980L, -8893439860390996458L, 2675284259168166631L, -7228792075400884364L, 4223524356356528048L}).toString();
            C4773.m8132(z5, AbstractC5568.m9378(C4217.f13994, c1393), false, null, c5362, 48);
            AbstractC0495.m1105(C3133.m5804(c03710.f1416, c5362), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((C4413) c5362.m8997(AbstractC4957.f16399)).f14550, c5362, 0, 0, 131070);
            c5363 = c5362;
            c5363.m9009(true);
            interfaceC1292 = c1393;
        } else {
            c5363 = c5362;
            c5363.m8982();
            interfaceC1292 = c1393;
        }
        c5863M8965 = c5363.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C2070(c0379, c1347, interfaceC1292, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۥۦ */
    public static final C0777 m5189(Object obj, String str, C5362 c5362, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        Object objM8999 = c5362.m8999();
        C4036 c4036 = C2850.f9517;
        if (objM8999 == c4036) {
            objM8999 = new C0777(new C5208(obj), null, str);
            c5362.m8987(objM8999);
        }
        C0777 c0777 = (C0777) objM8999;
        c0777.m1676(obj, c5362, (i & 8) | 48 | (i & 14));
        Object objM89910 = c5362.m8999();
        if (objM89910 == c4036) {
            objM89910 = new C0685(c0777, 1);
            c5362.m8987(objM89910);
        }
        AbstractC3925.m7028(c0777, (InterfaceC4745) objM89910, c5362);
        return c0777;
    }

    /* JADX INFO: renamed from: ۥۧ */
    public static InterfaceC0705 m5190(InterfaceC0705 interfaceC0705, C4885 c4885) {
        return interfaceC0705.mo1571(new C4952(c4885));
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static final void m5191(C0777 c0777, C3051 c3051, Object obj, Object obj2, InterfaceC0215 interfaceC0215, C5362 c5362, int i) {
        int i2;
        c5362.m8979(867041821);
        if ((i & 6) == 0) {
            i2 = (c5362.m8963(c0777) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c5362.m8963(c3051) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? c5362.m8963(obj) : c5362.m8977(obj) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? c5362.m8963(obj2) : c5362.m8977(obj2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? c5362.m8963(interfaceC0215) : c5362.m8977(interfaceC0215) ? 16384 : 8192;
        }
        if (!c5362.m9011(i2 & 1, (i2 & 9363) != 9362)) {
            c5362.m8982();
        } else if (c0777.m1681()) {
            c3051.m5657(obj, obj2, interfaceC0215);
        } else {
            c3051.m5659(obj2, interfaceC0215);
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C2455(c0777, c3051, obj, obj2, interfaceC0215, i, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c1, code lost:
    
        if (r15 == r6) goto L48;
     */
    /* JADX INFO: renamed from: ۦؖ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m5192(p000.C5475 r11, p000.InterfaceC1126 r12, p000.C5639 r13, int r14, p000.AbstractC2870 r15) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC2774.m5192(ۦٜٖۡؕ, ۥِؗۜ۠, ۦۤؑۗٛ, int, ۥۧؔۡؗ):java.lang.Object");
    }

    /* JADX INFO: renamed from: ۦؗ */
    public static final C5278 m5193(InterfaceC0443 interfaceC0443, InterfaceC3534 interfaceC3534, Object obj) {
        C5278 c5278 = null;
        if ((interfaceC0443 instanceof InterfaceC4853) && interfaceC3534.mo865(C2002.f6598) != null) {
            InterfaceC4853 interfaceC4853Mo3583 = (InterfaceC4853) interfaceC0443;
            while (!(interfaceC4853Mo3583 instanceof C1755) && (interfaceC4853Mo3583 = interfaceC4853Mo3583.mo3583()) != null) {
                if (interfaceC4853Mo3583 instanceof C5278) {
                    c5278 = (C5278) interfaceC4853Mo3583;
                    break;
                }
            }
            if (c5278 != null) {
                c5278.m8914(interfaceC3534, obj);
            }
        }
        return c5278;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
    
        if (r15 == r6) goto L35;
     */
    /* JADX INFO: renamed from: ۦؙ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m5194(p000.C5475 r12, p000.InterfaceC1126 r13, p000.C5639 r14, p000.AbstractC2870 r15) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC2774.m5194(ۦٜٖۡؕ, ۥِؗۜ۠, ۦۤؑۗٛ, ۥۧؔۡؗ):java.lang.Object");
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static final C3051 m5195(C0777 c0777, Object obj, Object obj2, InterfaceC0215 interfaceC0215, C1280 c1280, C5362 c5362, int i) {
        boolean zM8963 = c5362.m8963(c0777);
        Object objM8999 = c5362.m8999();
        Object obj3 = C2850.f9517;
        if (zM8963 || objM8999 == obj3) {
            AbstractC3191 abstractC3191M7473 = AbstractC4225.m7473();
            InterfaceC4745 interfaceC4745Mo4945 = abstractC3191M7473 != null ? abstractC3191M7473.mo4945() : null;
            AbstractC3191 abstractC3191M7452 = AbstractC4225.m7452(abstractC3191M7473);
            try {
                AbstractC1814 abstractC1814 = (AbstractC1814) c1280.f4359.mo211(obj2);
                abstractC1814.mo2175();
                objM8999 = new C3051(c0777, obj, abstractC1814, c1280);
                AbstractC4225.m7466(abstractC3191M7473, abstractC3191M7452, interfaceC4745Mo4945);
                c5362.m8987(objM8999);
            } catch (Throwable th) {
                AbstractC4225.m7466(abstractC3191M7473, abstractC3191M7452, interfaceC4745Mo4945);
                throw th;
            }
        }
        C3051 c3051 = (C3051) objM8999;
        m5191(c0777, c3051, obj, obj2, interfaceC0215, c5362, 0);
        boolean zM8964 = c5362.m8963(c0777) | c5362.m8963(c3051);
        Object objM89910 = c5362.m8999();
        if (zM8964 || objM89910 == obj3) {
            objM89910 = new C1708(18, c0777, c3051);
            c5362.m8987(objM89910);
        }
        AbstractC3925.m7028(c3051, (InterfaceC4745) objM89910, c5362);
        return c3051;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac A[LOOP:1: B:54:0x00a0->B:57:0x00ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x00b2 A[EDGE_INSN: B:79:0x00b2->B:58:0x00b2 BREAK  A[LOOP:1: B:54:0x00a0->B:57:0x00ac], SYNTHETIC] */
    /* JADX INFO: renamed from: ۦٌ */
    public static final InetAddress m5196(int i, int i2, String str) {
        int i3;
        int i4;
        int iM7224;
        byte[] bArr = new byte[16];
        int i5 = i;
        int i6 = 0;
        int i7 = -1;
        int i8 = -1;
        while (i5 < i2) {
            if (i6 == 16) {
                return null;
            }
            int i9 = i5 + 2;
            if (i9 <= i2 && str.startsWith("::", i5)) {
                if (i7 != -1) {
                    return null;
                }
                i6 += 2;
                i7 = i6;
                if (i9 == i2) {
                    break;
                }
                i8 = i9;
                i3 = 0;
                i5 = i8;
                while (i5 < i2) {
                    iM7224 = AbstractC4031.m7224(str.charAt(i5));
                    if (iM7224 != -1) {
                        break;
                        break;
                    }
                    i3 = (i3 << 4) + iM7224;
                    i5++;
                }
                i4 = i5 - i8;
                return i4 == 0 ? null : null;
            }
            if (i6 != 0) {
                if (!str.startsWith(":", i5)) {
                    if (!str.startsWith(".", i5)) {
                        return null;
                    }
                    int i10 = i6 - 2;
                    int i11 = i10;
                    while (i8 < i2) {
                        if (i11 == 16) {
                            return null;
                        }
                        if (i11 != i10) {
                            if (str.charAt(i8) != '.') {
                                return null;
                            }
                            i8++;
                        }
                        int i12 = 0;
                        int i13 = i8;
                        while (i13 < i2) {
                            char cCharAt = str.charAt(i13);
                            if (AbstractC3831.m6879(cCharAt, 48) < 0 || AbstractC3831.m6879(cCharAt, 57) > 0) {
                                break;
                            }
                            if ((i12 == 0 && i8 != i13) || (i12 = ((i12 * 10) + cCharAt) - 48) > 255) {
                                return null;
                            }
                            i13++;
                        }
                        if (i13 - i8 == 0) {
                            return null;
                        }
                        bArr[i11] = (byte) i12;
                        i11++;
                        i8 = i13;
                    }
                    if (i11 != i6 + 2) {
                        return null;
                    }
                    i6 += 2;
                    break;
                }
                i5++;
            }
            i8 = i5;
            i3 = 0;
            i5 = i8;
            while (i5 < i2) {
                iM7224 = AbstractC4031.m7224(str.charAt(i5));
                if (iM7224 != -1) {
                    break;
                }
                i3 = (i3 << 4) + iM7224;
                i5++;
            }
            i4 = i5 - i8;
            if (i4 == 0 && i4 <= 4) {
                int i14 = i6 + 1;
                bArr[i6] = (byte) (255 & (i3 >>> 8));
                i6 += 2;
                bArr[i14] = (byte) (i3 & 255);
            }
        }
        if (i6 != 16) {
            if (i7 == -1) {
                return null;
            }
            int i15 = i6 - i7;
            System.arraycopy(bArr, i7, bArr, 16 - i15, i15);
            Arrays.fill(bArr, i7, (16 - i6) + i7, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    /* JADX INFO: renamed from: ۦُ */
    public static final InterfaceC0705 m5197(InterfaceC0705 interfaceC0705) {
        return interfaceC0705.mo1571(new C5341());
    }

    /* JADX INFO: renamed from: ۦِ */
    public static final void m5198(int i, int i2) {
        if (i <= i2) {
            return;
        }
        C0178.m391(i, i2, ") is greater than size (", "toIndex (");
    }

    /* JADX WARN: Code duplicated, block: B:107:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00bc A[Catch: all -> 0x0053, TryCatch #1 {all -> 0x0053, blocks: (B:21:0x004f, B:44:0x00b4, B:46:0x00bc, B:48:0x00c8, B:50:0x00d4, B:41:0x009b), top: B:99:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00c8 A[Catch: all -> 0x0053, TryCatch #1 {all -> 0x0053, blocks: (B:21:0x004f, B:44:0x00b4, B:46:0x00bc, B:48:0x00c8, B:50:0x00d4, B:41:0x009b), top: B:99:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d4 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #1 {all -> 0x0053, blocks: (B:21:0x004f, B:44:0x00b4, B:46:0x00bc, B:48:0x00c8, B:50:0x00d4, B:41:0x009b), top: B:99:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0165, code lost:
    
        if (r3 == r13) goto L83;
     */
    /* JADX INFO: renamed from: ۦٕ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m5199(p000.C5475 r17, p000.C5470 r18, p000.C3510 r19, p000.C5639 r20, p000.AbstractC2870 r21) {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC2774.m5199(ۦٜٖۡؕ, ۦؘۡؕ٘, ۦؘؘؗٞ, ۦۤؑۗٛ, ۥۧؔۡؗ):java.lang.Object");
    }

    /* JADX INFO: renamed from: ۦٗ */
    public static final boolean m5200(C0605 c0605) {
        int iM6632 = AbstractC3761.m6632(c0605.f2261.f4244);
        if (iM6632 != 0) {
            if (iM6632 != 1) {
                if (iM6632 != 2) {
                    if (iM6632 != 3) {
                        if (iM6632 != 4) {
                            C1078.m2275();
                            return false;
                        }
                        C0605 c0605M1356 = c0605.m1356();
                        if (c0605M1356 != null) {
                            return m5200(c0605M1356);
                        }
                        C1078.m2272("no parent for idle node");
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦٚ */
    public static void m5201(Status status, Object obj, C2332 c2332) {
        if (status.f301 <= 0) {
            c2332.f7721.m6395(obj);
        } else {
            c2332.f7721.m6393(status.f298 != null ? new C5456(status) : new C1717(status));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۦٛ */
    public static final Serializable m5202(InterfaceC4707 interfaceC4707, InterfaceC4161 interfaceC4161, AbstractC0772 abstractC0772) throws Throwable {
        C4298 c4298;
        C5450 c5450;
        InterfaceC3196 interfaceC3196;
        CancellationException cancellationExceptionMo862;
        if (abstractC0772 instanceof C4298) {
            c4298 = (C4298) abstractC0772;
            int i = c4298.f14227;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4298.f14227 = i - Integer.MIN_VALUE;
            } else {
                c4298 = new C4298(abstractC0772);
            }
        } else {
            c4298 = new C4298(abstractC0772);
        }
        Object obj = c4298.f14225;
        int i2 = c4298.f14227;
        if (i2 == 0) {
            AbstractC0186.m409(obj);
            C5450 c5451 = new C5450();
            try {
                InterfaceC4161 c0793 = new C0793(interfaceC4161, c5451);
                c4298.f14226 = c5451;
                c4298.f14227 = 1;
                Object objMo1575 = interfaceC4707.mo1575(c0793, c4298);
                EnumC2282 enumC2282 = EnumC2282.f7590;
                if (objMo1575 == enumC2282) {
                    return enumC2282;
                }
                return null;
            } catch (Throwable th) {
                th = th;
                c5450 = c5451;
            }
        } else {
            if (i2 != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c5450 = c4298.f14226;
            try {
                AbstractC0186.m409(obj);
                return null;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        Throwable th3 = (Throwable) c5450.f17965;
        if ((th3 != null && th3.equals(th)) || ((interfaceC3196 = (InterfaceC3196) c4298.f2791.mo865(C1397.f4791)) != null && interfaceC3196.isCancelled() && (cancellationExceptionMo862 = interfaceC3196.mo862()) != null && cancellationExceptionMo862.equals(th))) {
            throw th;
        }
        if (th3 == null) {
            return th;
        }
        if (th instanceof CancellationException) {
            AbstractC5537.m9223(th3, th);
            throw th3;
        }
        AbstractC5537.m9223(th, th3);
        throw th;
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static final C5627 m5203(C0777 c0777, C1280 c1280, String str, C5362 c5362) {
        C5290 c5290;
        boolean zM8963 = c5362.m8963(c0777);
        Object objM8999 = c5362.m8999();
        Object obj = C2850.f9517;
        if (zM8963 || objM8999 == obj) {
            objM8999 = new C5627(c0777, c1280, str);
            c5362.m8987(objM8999);
        }
        C5627 c5627 = (C5627) objM8999;
        boolean zM8964 = c5362.m8963(c0777) | c5362.m8977(c5627);
        Object objM89910 = c5362.m8999();
        if (zM8964 || objM89910 == obj) {
            objM89910 = new C1708(17, c0777, c5627);
            c5362.m8987(objM89910);
        }
        AbstractC3925.m7028(c5627, (InterfaceC4745) objM89910, c5362);
        if (c0777.m1681() && (c5290 = (C5290) c5627.f18553.getValue()) != null) {
            C0777 c0778 = c5627.f18552;
            c5290.f17427.m5657(c5290.f17424.mo211(c0778.m1673().f8165), c5290.f17424.mo211(c0778.m1673().f8164), (InterfaceC0215) c5290.f17426.mo211(c0778.m1673()));
        }
        return c5627;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static final Object m5204(InterfaceC4038 interfaceC4038, C5470 c5470, InterfaceC1126 interfaceC1126, InterfaceC0443 interfaceC0443) {
        C2439 c2439 = (C2439) interfaceC4038;
        c2439.getClass();
        Object objM4126 = AbstractC2133.m4126(interfaceC4038, new C1623(new C3510(AbstractC5537.m9270(c2439).f2275), c5470, interfaceC1126, null), interfaceC0443);
        return objM4126 == EnumC2282.f7590 ? objM4126 : C2358.f7817;
    }

    /* JADX INFO: renamed from: ۦۚ */
    public static void m5205(String str, Exception exc) {
        Log.d(str, "", exc);
    }

    /* JADX INFO: renamed from: ۦۛ */
    public static boolean m5206() {
        Boolean bool;
        synchronized (AbstractC2774.class) {
            int i = f9243;
            bool = null;
            if (i < 0) {
                if (Process.myUid() == 0) {
                    f9243 = 2;
                    bool = Boolean.TRUE;
                } else {
                    for (String str : System.getenv("PATH").split(":")) {
                        if (new File(str, "su").canExecute()) {
                            f9243 = 1;
                        }
                    }
                    f9243 = 0;
                    bool = Boolean.FALSE;
                }
            } else if (i == 0) {
                bool = Boolean.FALSE;
            } else if (i == 2) {
                bool = Boolean.TRUE;
            }
        }
        return Objects.equals(bool, Boolean.FALSE);
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public static C3632 m5207(int i) {
        C4069 c4069 = C4069.f13547;
        float fM3331 = AbstractC1605.m3331((i >> 16) & 255);
        float fM3332 = AbstractC1605.m3331((i >> 8) & 255);
        float fM3333 = AbstractC1605.m3331(i & 255);
        double[][] dArr = AbstractC1605.f5391;
        double d = fM3331;
        double[] dArr2 = dArr[0];
        double d2 = fM3332;
        double d3 = fM3333;
        double d4 = (dArr2[2] * d3) + (dArr2[1] * d2) + (dArr2[0] * d);
        double[] dArr3 = dArr[1];
        double d5 = (dArr3[2] * d3) + (dArr3[1] * d2) + (dArr3[0] * d);
        double[] dArr4 = dArr[2];
        float[] fArr = {(float) d4, (float) d5, (float) ((d3 * dArr4[2]) + (d2 * dArr4[1]) + (d * dArr4[0]))};
        float[][] fArr2 = AbstractC1605.f5390;
        float f = fArr[0];
        float[] fArr3 = fArr2[0];
        float f2 = fArr3[0] * f;
        float f3 = fArr[1];
        float f4 = (fArr3[1] * f3) + f2;
        float f5 = fArr[2];
        float f6 = (fArr3[2] * f5) + f4;
        float[] fArr4 = fArr2[1];
        float f7 = (fArr4[2] * f5) + (fArr4[1] * f3) + (fArr4[0] * f);
        float[] fArr5 = fArr2[2];
        float f8 = (f5 * fArr5[2]) + (f3 * fArr5[1]) + (f * fArr5[0]);
        float[] fArr6 = c4069.f13557;
        float f9 = c4069.f13549;
        float f10 = c4069.f13551;
        float f11 = fArr6[0] * f6;
        float f12 = fArr6[1] * f7;
        float f13 = fArr6[2] * f8;
        float f14 = c4069.f13552;
        float fPow = (float) Math.pow((Math.abs(f11) * f14) / 100.0f, 0.41999998688697815d);
        float fPow2 = (float) Math.pow((Math.abs(f12) * f14) / 100.0f, 0.41999998688697815d);
        float fPow3 = (float) Math.pow((Math.abs(f13) * f14) / 100.0f, 0.41999998688697815d);
        float fSignum = ((Math.signum(f11) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f12) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f13) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        float f15 = ((((-12.0f) * fSignum2) + (fSignum * 11.0f)) + fSignum3) / 11.0f;
        float f16 = ((fSignum + fSignum2) - (fSignum3 * 2.0f)) / 9.0f;
        float f17 = fSignum2 * 20.0f;
        float f18 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f17)) / 20.0f;
        float f19 = (((fSignum * 40.0f) + f17) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f16, f15)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f20 = fAtan2;
        float f21 = (f20 * 3.1415927f) / 180.0f;
        float fPow4 = ((float) Math.pow((f19 * c4069.f13548) / f10, c4069.f13555 * f9)) * 100.0f;
        float fPow5 = ((float) Math.pow(((((((((float) Math.cos((((((double) f20) < 20.14d ? 360.0f + f20 : f20) * 3.1415927f) / 180.0f) + 2.0f)) + 3.8f) * 0.25f) * 3846.1538f) * c4069.f13550) * c4069.f13554) * ((float) Math.sqrt((f16 * f16) + (f15 * f15)))) / (f18 + 0.305f), 0.8999999761581421d)) * ((float) Math.pow(1.64f - ((float) Math.pow(0.28999999165534973d, c4069.f13553)), 0.7300000190734863d));
        float fSqrt = fPow5 * ((float) Math.sqrt(fPow4 / 100.0f));
        float f22 = c4069.f13556 * fSqrt;
        Math.sqrt((fPow5 * f9) / (f10 + 4.0f));
        float f23 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f22 * 0.0228f) + 1.0f)) * 43.85965f;
        double d6 = f21;
        return new C3632(f20, fSqrt, fPow4, f23, fLog * ((float) Math.cos(d6)), fLog * ((float) Math.sin(d6)));
    }

    /* JADX INFO: renamed from: ۦۨ */
    public static final InterfaceC3534 m5208(InterfaceC3534 interfaceC3534, InterfaceC3534 interfaceC3535, boolean z) {
        Boolean bool = Boolean.FALSE;
        int i = 1;
        boolean zBooleanValue = ((Boolean) interfaceC3534.mo875(new C4876(i), bool)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) interfaceC3535.mo875(new C4876(i), bool)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return interfaceC3534.mo860(interfaceC3535);
        }
        C4876 c4876 = new C4876(2);
        C4794 c4794 = C4794.f15814;
        InterfaceC3534 interfaceC3536 = (InterfaceC3534) interfaceC3534.mo875(c4876, c4794);
        Object objMo875 = interfaceC3535;
        if (zBooleanValue2) {
            objMo875 = interfaceC3535.mo875(new C4876(3), c4794);
        }
        return interfaceC3536.mo860((InterfaceC3534) objMo875);
    }
}
