package p000;

/* JADX INFO: renamed from: ۦٌۘؖٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5044 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f16728;

    /* JADX INFO: renamed from: ۥٖ */
    public int f16729;

    /* JADX INFO: renamed from: ۥۖ */
    public final /* synthetic */ int f16730;

    /* JADX INFO: renamed from: ۦٕ */
    public Object f16731;

    /* JADX INFO: renamed from: ۦٗ */
    public /* synthetic */ boolean f16732;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ C4482 f16733;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5044(C4482 c4482, int i, InterfaceC0443 interfaceC0443, int i2) {
        super(2, interfaceC0443);
        this.f16728 = i2;
        this.f16733 = c4482;
        this.f16730 = i;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        int i = this.f16728;
        int i2 = this.f16730;
        C4482 c4482 = this.f16733;
        switch (i) {
            case 0:
                C5044 c5044 = new C5044(c4482, i2, interfaceC0443, 0);
                c5044.f16732 = ((Boolean) obj).booleanValue();
                return c5044;
            default:
                C5044 c5045 = new C5044(c4482, i2, interfaceC0443, 1);
                c5045.f16732 = ((Boolean) obj).booleanValue();
                return c5045;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0066  */
    /* JADX WARN: Code duplicated, block: B:23:0x006b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7 */
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
    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) throws Throwable {
        Throwable th;
        AbstractC1996 c0933;
        boolean z;
        boolean z2;
        Object obj2;
        int iHashCode;
        int i = this.f16728;
        int iIntValue = this.f16730;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        C4482 c4482 = this.f16733;
        switch (i) {
            case 0:
                boolean z3 = this.f16729;
                try {
                    if (z3 == 0) {
                        AbstractC0186.m409(obj);
                        boolean z4 = this.f16732;
                        this.f16732 = z4;
                        this.f16729 = 1;
                        obj = c4482.m7763(z4, this);
                        z3 = z4;
                        if (obj == enumC2282) {
                            return enumC2282;
                        }
                    } else {
                        if (z3 != 1) {
                            if (z3 != 2) {
                                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            boolean z5 = this.f16732;
                            th = (Throwable) this.f16731;
                            AbstractC0186.m409(obj);
                            z3 = z5;
                            iIntValue = ((Number) obj).intValue();
                            th = th;
                            c0933 = new C0933(iIntValue, th);
                            z = z3;
                            return new C3869(c0933, Boolean.valueOf(z));
                        }
                        boolean z6 = this.f16732;
                        AbstractC0186.m409(obj);
                        z3 = z6;
                    }
                    c0933 = (AbstractC1996) obj;
                    z = z3;
                    break;
                } catch (Throwable th2) {
                    th = th2;
                    if (z3 != 0) {
                        InterfaceC5823 interfaceC5823M7761 = c4482.m7761();
                        this.f16731 = th;
                        this.f16732 = z3;
                        this.f16729 = 2;
                        Object objMo5825 = interfaceC5823M7761.mo5825(this);
                        if (objMo5825 == enumC2282) {
                            return enumC2282;
                        }
                        obj = objMo5825;
                        th = th;
                        z3 = z3;
                    }
                    c0933 = new C0933(iIntValue, th);
                    z = z3;
                    return new C3869(c0933, Boolean.valueOf(z));
                }
                return new C3869(c0933, Boolean.valueOf(z));
            default:
                int i2 = this.f16729;
                if (i2 != 0) {
                    if (i2 == 1) {
                        z2 = this.f16732;
                        AbstractC0186.m409(obj);
                    } else {
                        if (i2 != 2) {
                            C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj2 = this.f16731;
                        AbstractC0186.m409(obj);
                    }
                    iIntValue = ((Number) obj).intValue();
                    obj = obj2;
                    if (obj != null) {
                        iHashCode = obj.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    return new C4127(iHashCode, iIntValue, obj);
                }
                AbstractC0186.m409(obj);
                z2 = this.f16732;
                this.f16732 = z2;
                this.f16729 = 1;
                obj = ((C1988) c4482.f14800.getValue()).m3891(new C2476(3, (InterfaceC0443) null), this);
                if (obj == enumC2282) {
                    return enumC2282;
                }
                if (z2) {
                    InterfaceC5823 interfaceC5823M7762 = c4482.m7761();
                    this.f16731 = obj;
                    this.f16729 = 2;
                    Object objMo5826 = interfaceC5823M7762.mo5825(this);
                    if (objMo5826 == enumC2282) {
                        return enumC2282;
                    }
                    Object obj3 = obj;
                    obj = objMo5826;
                    obj2 = obj3;
                    iIntValue = ((Number) obj).intValue();
                    obj = obj2;
                }
                if (obj != null) {
                    iHashCode = obj.hashCode();
                } else {
                    iHashCode = 0;
                }
                return new C4127(iHashCode, iIntValue, obj);
        }
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f16728;
        C2358 c2358 = C2358.f7817;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        InterfaceC0443 interfaceC0443 = (InterfaceC0443) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((C5044) mo217(interfaceC0443, bool)).mo218(c2358);
    }
}
