package p000;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.Arrays;

/* JADX INFO: renamed from: ۥًؔؒۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0834 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C3369 f2953;

    /* JADX INFO: renamed from: ۥَ */
    public final int f2954;

    /* JADX INFO: renamed from: ۥُ */
    public final C4921 f2955;

    /* JADX INFO: renamed from: ۥّ */
    public final C4714 f2956;

    /* JADX INFO: renamed from: ۥْ */
    public final C1063 f2957;

    /* JADX INFO: renamed from: ۥٓ */
    public final C3294 f2958;

    /* JADX INFO: renamed from: ۥٖ */
    public final int f2959;

    /* JADX INFO: renamed from: ۥۖ */
    public final int f2960;

    /* JADX INFO: renamed from: ۥۗ */
    public final Object f2961;

    /* JADX INFO: renamed from: ۥۜ */
    public final boolean f2962;

    /* JADX INFO: renamed from: ۥۣ */
    public final Context f2963;

    /* JADX INFO: renamed from: ۦؑ */
    public final Bitmap.Config f2964;

    /* JADX INFO: renamed from: ۦؚ */
    public final AbstractC2132 f2965;

    /* JADX INFO: renamed from: ۦٌ */
    public final AbstractC2132 f2966;

    /* JADX INFO: renamed from: ۦِ */
    public final AbstractC2132 f2967;

    /* JADX INFO: renamed from: ۦٗ */
    public final int f2968;

    /* JADX INFO: renamed from: ۦٛ */
    public final boolean f2969;

    /* JADX INFO: renamed from: ۦۗ */
    public final AbstractC2132 f2970;

    /* JADX INFO: renamed from: ۦۙ */
    public final C4130 f2971;

    /* JADX INFO: renamed from: ۦۚ */
    public final AbstractC1434 f2972;

    /* JADX INFO: renamed from: ۦۛ */
    public final int f2973;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C5311 f2974;

    /* JADX INFO: renamed from: ۦۨ */
    public final C5895 f2975;

    public C0834(Context context, Object obj, C3369 c3369, Bitmap.Config config, int i, C4921 c4921, C4714 c4714, C4130 c4130, boolean z, boolean z2, int i2, int i3, int i4, AbstractC2132 abstractC2132, AbstractC2132 abstractC2133, AbstractC2132 abstractC2134, AbstractC2132 abstractC2135, AbstractC1434 abstractC1434, C5895 c5895, int i5, C5311 c5311, C1063 c1063, C3294 c3294) {
        this.f2963 = context;
        this.f2961 = obj;
        this.f2953 = c3369;
        this.f2964 = config;
        this.f2954 = i;
        this.f2955 = c4921;
        this.f2956 = c4714;
        this.f2971 = c4130;
        this.f2962 = z;
        this.f2969 = z2;
        this.f2959 = i2;
        this.f2968 = i3;
        this.f2973 = i4;
        this.f2967 = abstractC2132;
        this.f2970 = abstractC2133;
        this.f2965 = abstractC2134;
        this.f2966 = abstractC2135;
        this.f2972 = abstractC1434;
        this.f2975 = c5895;
        this.f2960 = i5;
        this.f2974 = c5311;
        this.f2957 = c1063;
        this.f2958 = c3294;
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
        if (!(obj instanceof C0834)) {
            return false;
        }
        C0834 c0834 = (C0834) obj;
        if (!this.f2963.equals(c0834.f2963) || !this.f2961.equals(c0834.f2961) || !AbstractC3831.m6874(this.f2953, c0834.f2953) || this.f2964 != c0834.f2964 || this.f2954 != c0834.f2954) {
            return false;
        }
        C2340 c2340 = C2340.f7777;
        return c2340.equals(c2340) && AbstractC3831.m6874(this.f2955, c0834.f2955) && AbstractC3831.m6874(this.f2956, c0834.f2956) && this.f2971.equals(c0834.f2971) && this.f2962 == c0834.f2962 && this.f2969 == c0834.f2969 && this.f2959 == c0834.f2959 && this.f2968 == c0834.f2968 && this.f2973 == c0834.f2973 && AbstractC3831.m6874(this.f2967, c0834.f2967) && AbstractC3831.m6874(this.f2970, c0834.f2970) && AbstractC3831.m6874(this.f2965, c0834.f2965) && AbstractC3831.m6874(this.f2966, c0834.f2966) && AbstractC3831.m6874(this.f2972, c0834.f2972) && this.f2975.equals(c0834.f2975) && this.f2960 == c0834.f2960 && this.f2974.equals(c0834.f2974) && this.f2957.equals(c0834.f2957) && AbstractC3831.m6874(this.f2958, c0834.f2958);
    }

    public final int hashCode() {
        int iHashCode = (this.f2961.hashCode() + (this.f2963.hashCode() * 31)) * 31;
        C3369 c3369 = this.f2953;
        int iM6632 = (((AbstractC3761.m6632(this.f2954) + ((this.f2964.hashCode() + ((iHashCode + (c3369 != null ? c3369.hashCode() : 0)) * 923521)) * 961)) * 29791) + 1) * 31;
        this.f2955.getClass();
        return this.f2958.hashCode() + ((this.f2974.f17489.hashCode() + ((AbstractC3761.m6632(this.f2960) + ((this.f2975.hashCode() + ((this.f2972.hashCode() + ((this.f2966.hashCode() + ((this.f2965.hashCode() + ((this.f2970.hashCode() + ((this.f2967.hashCode() + ((AbstractC3761.m6632(this.f2973) + ((AbstractC3761.m6632(this.f2968) + ((AbstractC3761.m6632(this.f2959) + AbstractC5078.m8672(AbstractC5078.m8672(AbstractC5078.m8672(AbstractC5078.m8672((this.f2971.f13752.hashCode() + ((((C4921.class.hashCode() + iM6632) * 31) + Arrays.hashCode(this.f2956.f15544)) * 31)) * 31, 31, true), 31, this.f2962), 31, this.f2969), 31, true)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * (-196513505));
    }
}
