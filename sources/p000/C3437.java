package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۦًؗؖۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3437 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C3504 f11407;

    /* JADX INFO: renamed from: ۥُ */
    public final /* synthetic */ C3504 f11408;

    /* JADX INFO: renamed from: ۥّ */
    public final /* synthetic */ int f11409;

    /* JADX INFO: renamed from: ۥۗ */
    public final C5440 f11410;

    /* JADX INFO: renamed from: ۥۜ */
    public final /* synthetic */ C1911 f11411;

    /* JADX INFO: renamed from: ۥۣ */
    public final C4912 f11412;

    /* JADX INFO: renamed from: ۦؑ */
    public final long f11413;

    /* JADX INFO: renamed from: ۦؚ */
    public final /* synthetic */ C0846 f11414;

    /* JADX INFO: renamed from: ۦِ */
    public final /* synthetic */ int f11415;

    /* JADX INFO: renamed from: ۦٛ */
    public final /* synthetic */ int f11416;

    /* JADX INFO: renamed from: ۦۗ */
    public final /* synthetic */ long f11417;

    /* JADX INFO: renamed from: ۦۙ */
    public final /* synthetic */ int f11418;

    public C3437(long j, C5440 c5440, C3504 c3504, int i, int i2, C1911 c1911, int i3, int i4, long j2, C0846 c0846) {
        this.f11408 = c3504;
        this.f11409 = i;
        this.f11418 = i2;
        this.f11411 = c1911;
        this.f11416 = i3;
        this.f11415 = i4;
        this.f11417 = j2;
        this.f11414 = c0846;
        C4912 c4912 = AbstractC0137.f547;
        this.f11412 = new C4912();
        this.f11410 = c5440;
        this.f11407 = c3504;
        this.f11413 = AbstractC0671.m1494(0, C3693.m6556(j), 0, Integer.MAX_VALUE, 5);
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
    public final C5851 m6221(long j, int i) {
        List list;
        C5440 c5440 = this.f11410;
        Object objMo5820 = c5440.mo5820(i);
        Object objMo7314 = c5440.mo7314(i);
        C4912 c4912 = this.f11412;
        List list2 = (List) c4912.m9571(i);
        if (list2 != null) {
            list = list2;
        } else {
            List listM6292 = this.f11407.m6292(i);
            int size = listM6292.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((InterfaceC1827) listM6292.get(i2)).mo3597(j));
            }
            c4912.m8319(i, arrayList);
            list = arrayList;
        }
        return new C5851(i, list, this.f11411, this.f11408.f11614.getLayoutDirection(), this.f11416, this.f11415, i != this.f11409 + (-1) ? this.f11418 : 0, this.f11417, objMo5820, objMo7314, this.f11414.f3037, j);
    }
}
