package p000;

/* JADX INFO: renamed from: ۦؘؚ٘٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4454 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C4508 f14695;

    public C4454(C4508 c4508) {
        this.f14695 = c4508;
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
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4454)) {
            return false;
        }
        C4454 c4454 = (C4454) obj;
        C4885 c4885 = C3133.f10545;
        return c4885.equals(c4885) && AbstractC3831.m6874(this.f14695, c4454.f14695);
    }

    public final int hashCode() {
        int iM8672 = AbstractC5078.m8672(1022 * 31, 31, false);
        C4508 c4508 = this.f14695;
        return iM8672 + (c4508 != null ? c4508.hashCode() : 0);
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + C3133.f10545 + ", overrideDescendants=false, touchBoundsExpansion=" + this.f14695 + ')';
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        C3489 c3489 = (C3489) abstractC5381;
        C4885 c4885 = C3133.f10545;
        if (!AbstractC3831.m6874(c3489.f6136, c4885)) {
            c3489.f6136 = c4885;
            if (c3489.f6135) {
                c3489.m3634();
            }
        }
        c3489.f6134 = this.f14695;
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        return new C3489(C3133.f10545, this.f14695);
    }
}
