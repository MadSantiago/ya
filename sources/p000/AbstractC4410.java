package p000;

/* JADX INFO: renamed from: ۦ٘ؑۥٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4410 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C4984 f14517;

    /* JADX INFO: renamed from: ۥُ */
    public static final C4984 f14518;

    /* JADX INFO: renamed from: ۥّ */
    public static final C4984 f14519;

    /* JADX INFO: renamed from: ۦؑ */
    public static final C4984 f14522;

    /* JADX INFO: renamed from: ۥۣ */
    public static final C4182 f14521 = new C4182(2);

    /* JADX INFO: renamed from: ۥۗ */
    public static final C4182 f14520 = new C4182(3);

    static {
        C4274 c4274 = C1298.f4423;
        f14517 = new C4984(1, false, new C5129(1, c4274), c4274);
        C4274 c4275 = C1298.f4433;
        f14522 = new C4984(1, false, new C5129(1, c4275), c4275);
        C3039 c3039 = C1298.f4431;
        f14518 = new C4984(3, false, new C5129(0, c3039), c3039);
        C3039 c30310 = C1298.f4456;
        f14519 = new C4984(3, false, new C5129(0, c30310), c30310);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static InterfaceC0705 m7700(InterfaceC0705 interfaceC0705, float f, float f2, int i) {
        return interfaceC0705.mo1571(new C0977(0.0f, (i & 1) != 0 ? Float.NaN : f, 0.0f, (i & 2) != 0 ? Float.NaN : f2, true, 5));
    }

    /* JADX INFO: renamed from: ۥُ */
    public static InterfaceC0705 m7701(InterfaceC0705 interfaceC0705, float f, float f2, float f3, float f4, int i) {
        return interfaceC0705.mo1571(new C0977(f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, false));
    }

    /* JADX INFO: renamed from: ۥّ */
    public static final InterfaceC0705 m7702(InterfaceC0705 interfaceC0705, float f) {
        return interfaceC0705.mo1571(new C0977(f, f, f, f, true));
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static final InterfaceC0705 m7703(InterfaceC0705 interfaceC0705, float f) {
        return interfaceC0705.mo1571(new C0977(0.0f, f, 0.0f, f, true, 5));
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static final InterfaceC0705 m7704(InterfaceC0705 interfaceC0705, float f, float f2, float f3, float f4) {
        return interfaceC0705.mo1571(new C0977(f, f2, f3, f4, true));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final InterfaceC0705 m7705(InterfaceC0705 interfaceC0705, float f, float f2) {
        return interfaceC0705.mo1571(new C2650(f, f2));
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static final InterfaceC0705 m7706(InterfaceC0705 interfaceC0705) {
        return interfaceC0705.mo1571(new C0977(20.0f, 20.0f, 20.0f, 20.0f, false));
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static InterfaceC0705 m7707(InterfaceC0705 interfaceC0705, int i) {
        C4984 c4984;
        C4274 c4274 = C1298.f4423;
        boolean z = (i & 2) == 0;
        if (!AbstractC3831.m6874(c4274, c4274) || z) {
            c4984 = (!AbstractC3831.m6874(c4274, C1298.f4433) || z) ? new C4984(1, z, new C5129(1, c4274), c4274) : f14522;
        } else {
            c4984 = f14517;
        }
        return interfaceC0705.mo1571(c4984);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۦٌ */
    public static InterfaceC0705 m7708(InterfaceC0705 interfaceC0705) {
        C4984 c4984;
        C3039 c3039 = C1298.f4431;
        if (c3039.equals(c3039)) {
            c4984 = f14518;
        } else {
            c4984 = c3039.equals(C1298.f4456) ? f14519 : new C4984(3, false, new C5129(0, c3039), c3039);
        }
        return interfaceC0705.mo1571(c4984);
    }

    /* JADX INFO: renamed from: ۦِ */
    public static final InterfaceC0705 m7709(float f) {
        return new C0977(f, 0.0f, f, 0.0f, true, 10);
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static InterfaceC0705 m7710(InterfaceC0705 interfaceC0705, float f, float f2, int i) {
        float f3 = (i & 2) != 0 ? Float.NaN : 24.0f;
        if ((i & 4) != 0) {
            f2 = Float.NaN;
        }
        return m7704(interfaceC0705, f, f3, f2, Float.NaN);
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static InterfaceC0705 m7711(InterfaceC0705 interfaceC0705, float f) {
        return interfaceC0705.mo1571(new C0977(Float.NaN, 0.0f, f, 0.0f, true, 10));
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static final InterfaceC0705 m7712(InterfaceC0705 interfaceC0705, float f, float f2) {
        return interfaceC0705.mo1571(new C0977(f, f2, f, f2, true));
    }
}
