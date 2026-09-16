package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.UUID;

/* JADX INFO: renamed from: ۦًٌؑؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3026 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C4216 f10188 = new C4216(0, C3218.f10796);

    /* JADX INFO: renamed from: ۥۗ */
    public static final C4216 f10187 = new C4216(0, C3218.f10786);

    /* JADX INFO: renamed from: ۥۗ */
    public static final boolean m5616(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0220  */
    /* JADX WARN: Code duplicated, block: B:103:0x0224  */
    /* JADX WARN: Code duplicated, block: B:105:0x024a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0254  */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0052  */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:54:0x010b  */
    /* JADX WARN: Code duplicated, block: B:55:0x010d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0115  */
    /* JADX WARN: Code duplicated, block: B:59:0x0117  */
    /* JADX WARN: Code duplicated, block: B:63:0x012f  */
    /* JADX WARN: Code duplicated, block: B:66:0x014b  */
    /* JADX WARN: Code duplicated, block: B:67:0x014d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0153  */
    /* JADX WARN: Code duplicated, block: B:71:0x0155  */
    /* JADX WARN: Code duplicated, block: B:77:0x0171  */
    /* JADX WARN: Code duplicated, block: B:80:0x0190  */
    /* JADX WARN: Code duplicated, block: B:81:0x0192  */
    /* JADX WARN: Code duplicated, block: B:85:0x019c  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:99:0x01fa  */
    /* JADX INFO: renamed from: ۥۣ */
    public static final void m5617(InterfaceC4396 interfaceC4396, InterfaceC4448 interfaceC4448, C5236 c5236, C0857 c0857, C5362 c5362, int i, int i2) {
        int i3;
        InterfaceC4448 interfaceC4449;
        C5236 c5237;
        boolean z;
        InterfaceC4448 interfaceC44410;
        C5863 c5863M8965;
        InterfaceC4448 interfaceC44411;
        View view;
        InterfaceC2880 interfaceC2880;
        String str;
        EnumC2459 enumC2459;
        C3102 c3102M1926;
        InterfaceC4367 interfaceC4367M5175;
        Object objM8999;
        Object obj;
        Object obj2;
        UUID uuid;
        boolean zBooleanValue;
        Object objM89910;
        int i4;
        String str2;
        boolean z2;
        C2453 c2453;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        boolean zM8963;
        Object objM89911;
        boolean z5;
        boolean z6;
        boolean zM8964;
        Object objM89912;
        boolean z7;
        boolean z8;
        Object obj3;
        boolean zM8977;
        Object obj4;
        boolean zM8978;
        int i7;
        Object obj5;
        boolean zM8979;
        Object obj6;
        InterfaceC4448 interfaceC44412;
        int i8;
        int i9;
        InterfaceC4396 interfaceC4397 = interfaceC4396;
        c5362.m8979(-1772091631);
        if ((i & 6) == 0) {
            i3 = (c5362.m8963(interfaceC4397) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                interfaceC4449 = interfaceC4448;
                i3 |= c5362.m8977(interfaceC4449) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                c5237 = c5236;
                if (c5362.m8963(c5237)) {
                    i9 = 256;
                } else {
                    i9 = 128;
                }
                i3 |= i9;
            } else {
                c5237 = c5236;
            }
            if ((i & 3072) == 0) {
                if (c5362.m8977(c0857)) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i3 |= i8;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (c5362.m9011(i3 & 1, z)) {
                if (i10 != 0) {
                    interfaceC44411 = null;
                } else {
                    interfaceC44411 = interfaceC4449;
                }
                view = (View) c5362.m8997(AbstractC4354.f14354);
                interfaceC2880 = (InterfaceC2880) c5362.m8997(AbstractC2853.f9544);
                str = (String) c5362.m8997(f10188);
                enumC2459 = (EnumC2459) c5362.m8997(AbstractC2853.f9555);
                c3102M1926 = AbstractC0949.m1926(c5362);
                interfaceC4367M5175 = AbstractC2774.m5175(c0857, c5362);
                Object[] objArr = new Object[0];
                objM8999 = c5362.m8999();
                obj = C2850.f9517;
                obj2 = objM8999;
                if (objM8999 == obj) {
                    Object obj7 = C3218.f10783;
                    c5362.m8987(obj7);
                    obj2 = obj7;
                }
                uuid = (UUID) AbstractC5378.m9032(objArr, (InterfaceC4448) obj2, c5362);
                zBooleanValue = ((Boolean) c5362.m8997(f10187)).booleanValue();
                objM89910 = c5362.m8999();
                if (objM89910 == obj) {
                    i4 = i3;
                    z2 = true;
                    str2 = str;
                    C2453 c2454 = new C2453(interfaceC44411, c5237, str2, view, interfaceC2880, interfaceC4397, uuid, zBooleanValue);
                    interfaceC4397 = interfaceC4397;
                    c2454.m4579(c3102M1926, new C0857(-297523940, new C3981(c2454, interfaceC4367M5175, true ? 1 : 0), true));
                    c5362.m8987(c2454);
                    objM89910 = c2454;
                } else {
                    i4 = i3;
                    str2 = str;
                    z2 = true;
                }
                c2453 = (C2453) objM89910;
                boolean zM89710 = c5362.m8977(c2453);
                i5 = i4 & 112;
                if (i5 == 32) {
                    z3 = z2;
                } else {
                    z3 = false;
                }
                boolean z9 = zM89710 | z3;
                i6 = i4 & 896;
                if (i6 == 256) {
                    z4 = z2;
                } else {
                    z4 = false;
                }
                zM8963 = z9 | z4 | c5362.m8963(str2) | c5362.m8988(enumC2459.ordinal());
                objM89911 = c5362.m8999();
                if (zM8963 || objM89911 == obj) {
                    Object c5838 = new C5838(c2453, interfaceC44411, c5236, str2, enumC2459);
                    c5362.m8987(c5838);
                    objM89911 = c5838;
                }
                AbstractC3925.m7028(c2453, (InterfaceC4745) objM89911, c5362);
                boolean zM89711 = c5362.m8977(c2453);
                if (i5 == 32) {
                    z5 = z2;
                } else {
                    z5 = false;
                }
                boolean z10 = zM89711 | z5;
                if (i6 == 256) {
                    z6 = z2;
                } else {
                    z6 = false;
                }
                zM8964 = z10 | z6 | c5362.m8963(str2) | c5362.m8988(enumC2459.ordinal());
                objM89912 = c5362.m8999();
                if (zM8964 || objM89912 == obj) {
                    Object c3999 = new C3999(c2453, interfaceC44411, c5236, str2, enumC2459);
                    c5362.m8987(c3999);
                    objM89912 = c3999;
                }
                AbstractC3925.m7040((InterfaceC4448) objM89912, c5362);
                boolean zM89712 = c5362.m8977(c2453);
                if ((i4 & 14) == 4) {
                    z7 = z2;
                } else {
                    z7 = false;
                }
                z8 = zM89712 | z7;
                Object objM89913 = c5362.m8999();
                obj3 = objM89913;
                if (z8 == 0 || objM89913 == obj) {
                    Object c5544 = new C5544(2, c2453, interfaceC4397);
                    c5362.m8987(c5544);
                    obj3 = c5544;
                }
                AbstractC3925.m7028(interfaceC4397, (InterfaceC4745) obj3, c5362);
                zM8977 = c5362.m8977(c2453);
                Object objM89914 = c5362.m8999();
                obj4 = objM89914;
                if (zM8977 || objM89914 == obj) {
                    Object c0023 = new C0023(c2453, null, 4);
                    c5362.m8987(c0023);
                    obj4 = c0023;
                }
                AbstractC3925.m7030((InterfaceC5731) obj4, c5362, c2453);
                zM8978 = c5362.m8977(c2453);
                Object objM89915 = c5362.m8999();
                if (!zM8978 || objM89915 == obj) {
                    i7 = 0;
                    Object c4399 = new C4399(c2453, 0);
                    c5362.m8987(c4399);
                    obj5 = c4399;
                } else {
                    i7 = 0;
                    obj5 = objM89915;
                }
                InterfaceC0705 interfaceC0705M4198 = AbstractC2164.m4198(C4217.f13994, (InterfaceC4745) obj5);
                zM8979 = c5362.m8977(c2453) | c5362.m8988(enumC2459.ordinal());
                Object objM89916 = c5362.m8999();
                obj6 = objM89916;
                if (zM8979 || objM89916 == obj) {
                    Object c1498 = new C1498(i7, c2453, enumC2459);
                    c5362.m8987(c1498);
                    obj6 = c1498;
                }
                InterfaceC3228 interfaceC3228 = (InterfaceC3228) obj6;
                int iHashCode = Long.hashCode(c5362.f17657);
                C2103 c2103M8994 = c5362.m8994();
                InterfaceC0705 interfaceC0705M2161 = AbstractC0993.m2161(c5362, interfaceC0705M4198);
                InterfaceC4576.f15106.getClass();
                interfaceC44412 = C0849.f3049;
                c5362.m8983();
                if (c5362.f17668) {
                    c5362.m9005(interfaceC44412);
                } else {
                    c5362.m8972();
                }
                AbstractC0993.m2127(C0849.f3048, c5362, interfaceC3228);
                AbstractC0993.m2127(C0849.f3047, c5362, c2103M8994);
                AbstractC0993.m2127(C0849.f3053, c5362, Integer.valueOf(iHashCode));
                AbstractC0993.m2146(c5362, C0849.f3050);
                AbstractC0993.m2127(C0849.f3052, c5362, interfaceC0705M2161);
                c5362.m9009(z2);
                interfaceC44410 = interfaceC44411;
            } else {
                c5362.m8982();
                interfaceC44410 = interfaceC4449;
            }
            c5863M8965 = c5362.m8965();
            if (c5863M8965 != null) {
                c5863M8965.f19365 = new C2516(interfaceC4397, interfaceC44410, c5236, c0857, i, i2);
            }
        }
        i3 |= 48;
        interfaceC4449 = interfaceC4448;
        if ((i & 384) == 0) {
            c5237 = c5236;
            if (c5362.m8963(c5237)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i3 |= i9;
        } else {
            c5237 = c5236;
        }
        if ((i & 3072) == 0) {
            if (c5362.m8977(c0857)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i3 |= i8;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (c5362.m9011(i3 & 1, z)) {
            if (i10 != 0) {
                interfaceC44411 = null;
            } else {
                interfaceC44411 = interfaceC4449;
            }
            view = (View) c5362.m8997(AbstractC4354.f14354);
            interfaceC2880 = (InterfaceC2880) c5362.m8997(AbstractC2853.f9544);
            str = (String) c5362.m8997(f10188);
            enumC2459 = (EnumC2459) c5362.m8997(AbstractC2853.f9555);
            c3102M1926 = AbstractC0949.m1926(c5362);
            interfaceC4367M5175 = AbstractC2774.m5175(c0857, c5362);
            Object[] objArr2 = new Object[0];
            objM8999 = c5362.m8999();
            obj = C2850.f9517;
            obj2 = objM8999;
            if (objM8999 == obj) {
                Object obj8 = C3218.f10783;
                c5362.m8987(obj8);
                obj2 = obj8;
            }
            uuid = (UUID) AbstractC5378.m9032(objArr2, (InterfaceC4448) obj2, c5362);
            zBooleanValue = ((Boolean) c5362.m8997(f10187)).booleanValue();
            objM89910 = c5362.m8999();
            if (objM89910 == obj) {
                i4 = i3;
                z2 = true;
                str2 = str;
                C2453 c2455 = new C2453(interfaceC44411, c5237, str2, view, interfaceC2880, interfaceC4397, uuid, zBooleanValue);
                interfaceC4397 = interfaceC4397;
                c2455.m4579(c3102M1926, new C0857(-297523940, new C3981(c2455, interfaceC4367M5175, true ? 1 : 0), true));
                c5362.m8987(c2455);
                objM89910 = c2455;
            } else {
                i4 = i3;
                str2 = str;
                z2 = true;
            }
            c2453 = (C2453) objM89910;
            boolean zM89713 = c5362.m8977(c2453);
            i5 = i4 & 112;
            if (i5 == 32) {
                z3 = z2;
            } else {
                z3 = false;
            }
            boolean z11 = zM89713 | z3;
            i6 = i4 & 896;
            if (i6 == 256) {
                z4 = z2;
            } else {
                z4 = false;
            }
            zM8963 = z11 | z4 | c5362.m8963(str2) | c5362.m8988(enumC2459.ordinal());
            objM89911 = c5362.m8999();
            if (zM8963) {
                Object c5839 = new C5838(c2453, interfaceC44411, c5236, str2, enumC2459);
                c5362.m8987(c5839);
                objM89911 = c5839;
            } else {
                Object c58310 = new C5838(c2453, interfaceC44411, c5236, str2, enumC2459);
                c5362.m8987(c58310);
                objM89911 = c58310;
            }
            AbstractC3925.m7028(c2453, (InterfaceC4745) objM89911, c5362);
            boolean zM89714 = c5362.m8977(c2453);
            if (i5 == 32) {
                z5 = z2;
            } else {
                z5 = false;
            }
            boolean z12 = zM89714 | z5;
            if (i6 == 256) {
                z6 = z2;
            } else {
                z6 = false;
            }
            zM8964 = z12 | z6 | c5362.m8963(str2) | c5362.m8988(enumC2459.ordinal());
            objM89912 = c5362.m8999();
            if (zM8964) {
                Object c39910 = new C3999(c2453, interfaceC44411, c5236, str2, enumC2459);
                c5362.m8987(c39910);
                objM89912 = c39910;
            } else {
                Object c39911 = new C3999(c2453, interfaceC44411, c5236, str2, enumC2459);
                c5362.m8987(c39911);
                objM89912 = c39911;
            }
            AbstractC3925.m7040((InterfaceC4448) objM89912, c5362);
            boolean zM89715 = c5362.m8977(c2453);
            if ((i4 & 14) == 4) {
                z7 = z2;
            } else {
                z7 = false;
            }
            z8 = zM89715 | z7;
            Object objM89917 = c5362.m8999();
            obj3 = objM89917;
            if (z8 == 0) {
                Object c5545 = new C5544(2, c2453, interfaceC4397);
                c5362.m8987(c5545);
                obj3 = c5545;
            } else {
                Object c5546 = new C5544(2, c2453, interfaceC4397);
                c5362.m8987(c5546);
                obj3 = c5546;
            }
            AbstractC3925.m7028(interfaceC4397, (InterfaceC4745) obj3, c5362);
            zM8977 = c5362.m8977(c2453);
            Object objM89918 = c5362.m8999();
            obj4 = objM89918;
            if (zM8977) {
                Object c0024 = new C0023(c2453, null, 4);
                c5362.m8987(c0024);
                obj4 = c0024;
            } else {
                Object c0025 = new C0023(c2453, null, 4);
                c5362.m8987(c0025);
                obj4 = c0025;
            }
            AbstractC3925.m7030((InterfaceC5731) obj4, c5362, c2453);
            zM8978 = c5362.m8977(c2453);
            Object objM89919 = c5362.m8999();
            if (zM8978) {
                i7 = 0;
                Object c43910 = new C4399(c2453, 0);
                c5362.m8987(c43910);
                obj5 = c43910;
            } else {
                i7 = 0;
                Object c43911 = new C4399(c2453, 0);
                c5362.m8987(c43911);
                obj5 = c43911;
            }
            InterfaceC0705 interfaceC0705M4199 = AbstractC2164.m4198(C4217.f13994, (InterfaceC4745) obj5);
            zM8979 = c5362.m8977(c2453) | c5362.m8988(enumC2459.ordinal());
            Object objM899110 = c5362.m8999();
            obj6 = objM899110;
            if (zM8979) {
                Object c1499 = new C1498(i7, c2453, enumC2459);
                c5362.m8987(c1499);
                obj6 = c1499;
            } else {
                Object c14910 = new C1498(i7, c2453, enumC2459);
                c5362.m8987(c14910);
                obj6 = c14910;
            }
            InterfaceC3228 interfaceC3229 = (InterfaceC3228) obj6;
            int iHashCode2 = Long.hashCode(c5362.f17657);
            C2103 c2103M8995 = c5362.m8994();
            InterfaceC0705 interfaceC0705M2162 = AbstractC0993.m2161(c5362, interfaceC0705M4199);
            InterfaceC4576.f15106.getClass();
            interfaceC44412 = C0849.f3049;
            c5362.m8983();
            if (c5362.f17668) {
                c5362.m9005(interfaceC44412);
            } else {
                c5362.m8972();
            }
            AbstractC0993.m2127(C0849.f3048, c5362, interfaceC3229);
            AbstractC0993.m2127(C0849.f3047, c5362, c2103M8995);
            AbstractC0993.m2127(C0849.f3053, c5362, Integer.valueOf(iHashCode2));
            AbstractC0993.m2146(c5362, C0849.f3050);
            AbstractC0993.m2127(C0849.f3052, c5362, interfaceC0705M2162);
            c5362.m9009(z2);
            interfaceC44410 = interfaceC44411;
        } else {
            c5362.m8982();
            interfaceC44410 = interfaceC4449;
        }
        c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C2516(interfaceC4397, interfaceC44410, c5236, c0857, i, i2);
        }
    }
}
