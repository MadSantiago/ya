package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: renamed from: ۥِؒٙۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1088 extends AbstractC4134 {

    /* JADX INFO: renamed from: ۥّ */
    public static final C1088 f3797 = new C1088(2);

    /* JADX INFO: renamed from: ۥۜ */
    public static final String f3798;

    /* JADX INFO: renamed from: ۦِ */
    public static final String[] f3799;

    /* JADX INFO: renamed from: ۦٛ */
    public static final int f3800;

    /* JADX INFO: renamed from: ۦۙ */
    public static final String f3801;

    static {
        C3037 c3037 = EnumC3573.f11834;
        f3801 = c3037.f11896;
        f3798 = c3037.f11895;
        f3800 = c3037.f11893;
        f3799 = new String[]{new C4441(new long[]{-767206921972981212L, 3558723408125737802L, -5614310306479353L, 4148083482099635160L, 4572781332399915956L}).toString(), new C4441(new long[]{-2146536603084792917L, -8248755887142039520L, -961856949982601015L, 4119957153716945730L, 8661854137757853450L, -4730361068261557383L, 3949577036749081443L, -1794276836960709116L, 753190937552254676L}).toString()};
    }

    @Override // p000.AbstractC4134
    /* JADX INFO: renamed from: ۥٖ */
    public final void mo482() {
        m7322(new C1797(8));
    }

    @Override // p000.AbstractC4134
    /* JADX INFO: renamed from: ۥۖ */
    public final C2351 mo483() {
        C2351 c2351 = new C2351(1);
        C0637 c0637 = new C0637();
        String[] strArr = f3799;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        ArrayList arrayList = new ArrayList(strArr2.length);
        for (String str : strArr2) {
            arrayList.add(new C2203(5, str, false));
        }
        c0637.f2382 = new ArrayList(arrayList);
        c2351.f7798 = c0637;
        return c2351;
    }

    @Override // p000.AbstractC4134, p000.AbstractC3003
    /* JADX INFO: renamed from: ۥۜ */
    public final void mo221() {
        C4524.f14953.getClass();
        C1443 c1443M7845 = C4524.m7845();
        C1542 c1542 = AbstractC2539.f8452;
        Object obj = c1542.f5218;
        String str = c1542.f5219;
        boolean z = C1443.f4940;
        if (((Set) c1443M7845.m3068(obj, str)).contains(EnumC3528.f11695.f11701)) {
            return;
        }
        m7321();
    }

    @Override // p000.AbstractC1985
    /* JADX INFO: renamed from: ۦؚ */
    public final String mo484() {
        return f3801;
    }

    @Override // p000.AbstractC1985
    /* JADX INFO: renamed from: ۦِ */
    public final int mo222() {
        return f3800;
    }

    @Override // p000.AbstractC4134
    /* JADX INFO: renamed from: ۦٗ */
    public final C2351 mo485() {
        C2351 c2351 = new C2351(0);
        C2672 c2672 = new C2672();
        String[] strArr = f3799;
        c2672.m4978((String[]) Arrays.copyOf(strArr, strArr.length));
        c2351.f7798 = c2672;
        return c2351;
    }

    @Override // p000.AbstractC1985
    /* JADX INFO: renamed from: ۦۗ */
    public final String mo223() {
        return f3798;
    }
}
