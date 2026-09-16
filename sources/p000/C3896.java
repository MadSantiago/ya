package p000;

/* JADX INFO: renamed from: ۦُٖؓۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3896 extends AbstractC5381 {

    /* JADX INFO: renamed from: ۥً */
    public C2321 f13016;

    /* JADX INFO: renamed from: ۦٚ */
    public final /* synthetic */ C3378 f13017;

    public C3896(C3378 c3378) {
        this.f13017 = c3378;
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۥ */
    public final void mo780() {
        C3378 c3378 = this.f13017;
        c3378.f11266 = this;
        if (c3378.f11265 != null) {
            m6974();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۥؑ */
    public final void m6974() {
        C0079 c0079 = new C0079(2, this, this.f13017);
        C0605 c0605M9270 = AbstractC5537.m9270(this);
        int i = c0605M9270.f2273;
        C5461 rectManager = ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5359.m8951(c0605M9270)).getRectManager();
        C1545 c1545 = rectManager.f18003;
        c1545.getClass();
        C4912 c4912 = c1545.f5226;
        C2321 c2321 = new C2321(c1545, i, this, c0079);
        Object objM9571 = c4912.m9571(i);
        if (objM9571 == null) {
            c4912.m8319(i, c2321);
            objM9571 = c2321;
        }
        C2321 c2322 = (C2321) objM9571;
        if (c2322 != c2321) {
            while (true) {
                C2321 c2323 = c2322.f7680;
                if (c2323 == null) {
                    break;
                } else {
                    c2322 = c2323;
                }
            }
            c2322.f7680 = c2321;
        }
        if (AbstractC5537.m9270(this.f17791).f2269) {
            rectManager.f18006.m6309(i, true);
        }
        rectManager.f18004 = true;
        rectManager.m9140();
        this.f13016 = c2321;
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦٓ */
    public final void mo788() {
        C3378 c3378 = this.f13017;
        if (c3378.f11266 == this) {
            c3378.f11266 = null;
        }
        C2321 c2321 = this.f13016;
        if (c2321 != null) {
            c2321.m4364();
        }
        this.f13016 = null;
    }
}
