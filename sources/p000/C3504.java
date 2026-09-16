package p000;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: ۦؘٖؗٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3504 implements InterfaceC2427 {

    /* JADX INFO: renamed from: ۥْ */
    public final InterfaceC4112 f11612;

    /* JADX INFO: renamed from: ۥٓ */
    public final C4912 f11613;

    /* JADX INFO: renamed from: ۦ۟ */
    public final InterfaceC1422 f11614;

    /* JADX INFO: renamed from: ۦۨ */
    public final C0880 f11615;

    public C3504(C0880 c0880, InterfaceC1422 interfaceC1422) {
        this.f11615 = c0880;
        this.f11614 = interfaceC1422;
        this.f11612 = (InterfaceC4112) c0880.f3215.mo449();
        AbstractC0137.m301();
        this.f11613 = new C4912();
    }

    @Override // p000.InterfaceC0151
    public final EnumC2459 getLayoutDirection() {
        return this.f11614.getLayoutDirection();
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥؖ */
    public final float mo741(float f) {
        return this.f11614.mo741(f);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥٌ */
    public final long mo742(float f) {
        return this.f11614.mo742(f);
    }

    @Override // p000.InterfaceC0151
    /* JADX INFO: renamed from: ۥٖ */
    public final boolean mo323() {
        return this.f11614.mo323();
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥٝ */
    public final int mo743(float f) {
        return this.f11614.mo743(f);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥٞ */
    public final float mo744(long j) {
        return this.f11614.mo744(j);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥۖ */
    public final long mo745(float f) {
        return this.f11614.mo745(f);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥۗ */
    public final float mo746() {
        return this.f11614.mo746();
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥۢ */
    public final long mo747(long j) {
        return this.f11614.mo747(j);
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
    /* JADX INFO: renamed from: ۥۣ */
    public final List m6292(int i) {
        C4912 c4912 = this.f11613;
        List list = (List) c4912.m9571(i);
        if (list != null) {
            return list;
        }
        InterfaceC4112 interfaceC4112 = this.f11612;
        Object objMo5820 = interfaceC4112.mo5820(i);
        List listMo750 = this.f11614.mo750(this.f11615.m1873(i, objMo5820, interfaceC4112.mo7314(i)), objMo5820);
        c4912.m8319(i, listMo750);
        return listMo750;
    }

    @Override // p000.InterfaceC2427
    /* JADX INFO: renamed from: ۥۤ */
    public final InterfaceC5370 mo748(int i, int i2, Map map, InterfaceC4745 interfaceC4745, InterfaceC4745 interfaceC4746) {
        return this.f11614.mo748(i, i2, map, interfaceC4745, interfaceC4746);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥۦ */
    public final int mo749(long j) {
        return this.f11614.mo749(j);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۦُ */
    public final float mo751(long j) {
        return this.f11614.mo751(j);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۦٕ */
    public final long mo752(long j) {
        return this.f11614.mo752(j);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۦۖ */
    public final float mo753(float f) {
        return this.f11614.mo753(f);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۦۚ */
    public final float mo754() {
        return this.f11614.mo754();
    }

    @Override // p000.InterfaceC2427
    /* JADX INFO: renamed from: ۦۤ */
    public final InterfaceC5370 mo755(int i, int i2, Map map, InterfaceC4745 interfaceC4745) {
        return this.f11614.mo755(i, i2, map, interfaceC4745);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۦۦ */
    public final float mo756(int i) {
        return this.f11614.mo756(i);
    }
}
