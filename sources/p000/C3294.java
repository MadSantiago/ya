package p000;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: ۦؕؗؑٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3294 {

    /* JADX INFO: renamed from: ۥۗ */
    public final Bitmap.Config f11030;

    /* JADX INFO: renamed from: ۥۣ */
    public final AbstractC2132 f11031;

    public C3294() {
        C0649 c0649 = AbstractC0912.f3276;
        C5136 c5136 = AbstractC5794.f19088.f17018;
        ExecutorC4540 executorC4540 = ExecutorC4540.f15006;
        Bitmap.Config config = AbstractC0080.f15150;
        this.f11031 = c5136;
        this.f11030 = config;
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
        if (!(obj instanceof C3294)) {
            return false;
        }
        C3294 c3294 = (C3294) obj;
        if (!AbstractC3831.m6874(this.f11031, c3294.f11031)) {
            return false;
        }
        ExecutorC4540 executorC4540 = ExecutorC4540.f15006;
        C4921 c4921 = C4921.f16229;
        return c4921.equals(c4921) && this.f11030 == c3294.f11030;
    }

    public final int hashCode() {
        int iHashCode = this.f11031.hashCode() * 31;
        ExecutorC4540 executorC4540 = ExecutorC4540.f15006;
        return AbstractC3761.m6632(1) + ((AbstractC3761.m6632(1) + ((AbstractC3761.m6632(1) + AbstractC5078.m8672(AbstractC5078.m8672((this.f11030.hashCode() + ((AbstractC3761.m6632(3) + ((C4921.class.hashCode() + ((executorC4540.hashCode() + ((executorC4540.hashCode() + ((executorC4540.hashCode() + iHashCode) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, true), 923521, false)) * 31)) * 31);
    }
}
