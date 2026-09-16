package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ۥؚِؐؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0114 {

    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC5731 f454;

    /* JADX INFO: renamed from: ۥُ */
    public final ArrayList f455 = new ArrayList(C2340.f7777);

    /* JADX INFO: renamed from: ۥۗ */
    public final C4093 f456;

    /* JADX INFO: renamed from: ۥۣ */
    public final C3131 f457;

    /* JADX INFO: renamed from: ۦؑ */
    public final int f458;

    public C0114(C3131 c3131, C4093 c4093, InterfaceC5731 interfaceC5731, int i) {
        this.f457 = c3131;
        this.f456 = c4093;
        this.f454 = interfaceC5731;
        this.f458 = i;
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
        C0114 c0114 = (C0114) obj;
        if (!this.f457.equals(c0114.f457) || !AbstractC3831.m6874(this.f456, c0114.f456)) {
            return false;
        }
        C4671 c4671 = C1489.f5055;
        return c4671.equals(c4671);
    }

    public final int hashCode() {
        C4093 c4093 = this.f456;
        return ((this.f457.hashCode() + ((c4093 != null ? c4093.f13661.hashCode() : 0) * 31)) * 31) - 1466499394;
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
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        int i = this.f458;
        if (i == 1) {
            str = "Singleton";
        } else if (i != 2) {
            str = i != 3 ? "null" : "Scoped";
        } else {
            str = "Factory";
        }
        sb.append(str);
        sb.append(": '");
        sb.append(AbstractC2919.m5505(this.f457));
        sb.append('\'');
        Object obj = this.f456;
        if (obj != null) {
            sb.append(",qualifier:");
            sb.append(obj);
        }
        C4671 c4671 = C1489.f5055;
        if (!c4671.equals(c4671)) {
            sb.append(",scope:");
            sb.append(c4671);
        }
        ArrayList arrayList = this.f455;
        if (!arrayList.isEmpty()) {
            sb.append(",binds:");
            AbstractC0973.m2048(arrayList, sb, ",", new C0086(7), 60);
        }
        sb.append(']');
        return sb.toString();
    }
}
