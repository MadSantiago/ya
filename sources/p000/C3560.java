package p000;

/* JADX INFO: renamed from: ۦؙؖۛۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3560 extends AbstractC1127 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ Object f11794;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f11795;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ Object f11796;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f11797;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3560(InterfaceC4745 interfaceC4745, InterfaceC0705 interfaceC0705, InterfaceC4745 interfaceC4746, int i) {
        super(2);
        this.f11797 = 0;
        this.f11795 = interfaceC4745;
        this.f11794 = interfaceC0705;
        this.f11796 = interfaceC4746;
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
    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        Object objM1671;
        int i = this.f11797;
        C4036 c4036 = C2850.f9517;
        C2358 c2358 = C2358.f7817;
        Object obj3 = this.f11794;
        Object obj4 = this.f11796;
        Object obj5 = this.f11795;
        int i2 = 0;
        int i3 = 1;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                AbstractC4489.m7795((InterfaceC4745) obj5, (InterfaceC0705) obj3, (InterfaceC4745) obj4, (C5362) obj, AbstractC3831.m6835(1));
                return c2358;
            case 1:
                ((Number) obj2).intValue();
                AbstractC2853.m5418((InterfaceC2043) obj5, (C0555) obj4, (C0857) obj3, (C5362) obj, AbstractC3831.m6835(1));
                return c2358;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C5362 c5362 = (C5362) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (c5362.m9011(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C0777 c0777 = (C0777) obj5;
                    InterfaceC0215 interfaceC0215 = (InterfaceC0215) obj4;
                    C1280 c1280 = AbstractC3831.f12709;
                    if (c0777.m1681()) {
                        c5362.m8957(1666827533);
                        c5362.m9009(false);
                        objM1671 = c0777.m1671();
                    } else {
                        c5362.m8957(1666573488);
                        boolean zM8963 = c5362.m8963(c0777);
                        objM1671 = c5362.m8999();
                        if (zM8963 || objM1671 == c4036) {
                            AbstractC3191 abstractC3191M7473 = AbstractC4225.m7473();
                            InterfaceC4745 interfaceC4745Mo4945 = abstractC3191M7473 != null ? abstractC3191M7473.mo4945() : null;
                            AbstractC3191 abstractC3191M7452 = AbstractC4225.m7452(abstractC3191M7473);
                            try {
                                Object objM1672 = c0777.m1671();
                                AbstractC4225.m7466(abstractC3191M7473, abstractC3191M7452, interfaceC4745Mo4945);
                                c5362.m8987(objM1672);
                                objM1671 = objM1672;
                            } catch (Throwable th) {
                                AbstractC4225.m7466(abstractC3191M7473, abstractC3191M7452, interfaceC4745Mo4945);
                                throw th;
                            }
                        }
                        c5362.m9009(false);
                    }
                    c5362.m8957(1378811975);
                    float f = AbstractC3831.m6874(objM1671, obj3) ? 1.0f : 0.0f;
                    c5362.m9009(false);
                    Float fValueOf = Float.valueOf(f);
                    boolean zM8964 = c5362.m8963(c0777);
                    Object objM8999 = c5362.m8999();
                    Object obj6 = objM8999;
                    if (zM8964 || objM8999 == c4036) {
                        C5704 c5704M5600 = AbstractC3004.m5600(new C5489(c0777, 0));
                        c5362.m8987(c5704M5600);
                        obj6 = c5704M5600;
                    }
                    Object value = ((InterfaceC5372) obj6).getValue();
                    c5362.m8957(1378811975);
                    float f2 = AbstractC3831.m6874(value, obj3) ? 1.0f : 0.0f;
                    c5362.m9009(false);
                    Float fValueOf2 = Float.valueOf(f2);
                    boolean zM8965 = c5362.m8963(c0777);
                    Object objM89910 = c5362.m8999();
                    Object obj7 = objM89910;
                    if (zM8965 || objM89910 == c4036) {
                        C5704 c5704M5601 = AbstractC3004.m5600(new C5489(c0777, 1));
                        c5362.m8987(c5704M5601);
                        obj7 = c5704M5601;
                    }
                    c5362.m8957(955869654);
                    c5362.m9009(false);
                    C3051 c3051M5195 = AbstractC2774.m5195(c0777, fValueOf, fValueOf2, interfaceC0215, c1280, c5362, 0);
                    boolean zM8966 = c5362.m8963(c3051M5195);
                    Object objM89911 = c5362.m8999();
                    Object obj8 = objM89911;
                    if (zM8966 || objM89911 == c4036) {
                        C2932 c2932 = new C2932(12, c3051M5195);
                        c5362.m8987(c2932);
                        obj8 = c2932;
                    }
                    InterfaceC0705 interfaceC0705M7887 = AbstractC4554.m7887(C4217.f13994, (InterfaceC4745) obj8);
                    C0857 c0857 = AbstractC2765.f9176;
                    InterfaceC3228 interfaceC3228M2297 = AbstractC1089.m2297(C1298.f4456, false);
                    int iHashCode = Long.hashCode(c5362.f17657);
                    C2103 c2103M8994 = c5362.m8994();
                    InterfaceC0705 interfaceC0705M2161 = AbstractC0993.m2161(c5362, interfaceC0705M7887);
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
                    AbstractC0993.m2153(c5362, Integer.valueOf(iHashCode), C0849.f3053);
                    AbstractC0993.m2146(c5362, C0849.f3050);
                    AbstractC0993.m2127(C0849.f3052, c5362, interfaceC0705M2161);
                    c0857.mo1173(obj3, c5362, 0);
                    c5362.m9009(true);
                } else {
                    c5362.m8982();
                }
                return c2358;
            default:
                C5362 c5363 = (C5362) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C2074 c2074 = (C2074) obj5;
                if (c5363.m9011(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850 = c2074.f6848;
                    boolean zM8977 = c5363.m8977(c2074);
                    Object objM89912 = c5363.m8999();
                    if (zM8977 || objM89912 == c4036) {
                        objM89912 = new C2757(c2074, false ? 1 : 0, i2);
                        c5363.m8987(objM89912);
                    }
                    AbstractC3925.m7030((InterfaceC5731) objM89912, c5363, viewTreeObserverOnGlobalLayoutListenerC0850);
                    boolean zM8978 = c5363.m8977(c2074);
                    Object objM89913 = c5363.m8999();
                    if (zM8978 || objM89913 == c4036) {
                        objM89913 = new C2757(c2074, false ? 1 : 0, i3);
                        c5363.m8987(objM89913);
                    }
                    AbstractC3925.m7030((InterfaceC5731) objM89913, c5363, viewTreeObserverOnGlobalLayoutListenerC0850);
                    ((C5686) obj4).m9502(viewTreeObserverOnGlobalLayoutListenerC0850, (C0857) obj3, c5363, 0);
                } else {
                    c5363.m8982();
                }
                return c2358;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3560(InterfaceC2043 interfaceC2043, C0555 c0555, C0857 c0857, int i) {
        super(2);
        this.f11797 = 1;
        this.f11795 = interfaceC2043;
        this.f11796 = c0555;
        this.f11794 = c0857;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3560(Object obj, Object obj2, Object obj3, int i) {
        super(2);
        this.f11797 = i;
        this.f11795 = obj;
        this.f11796 = obj2;
        this.f11794 = obj3;
    }
}
