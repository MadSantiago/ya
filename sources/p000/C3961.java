package p000;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: renamed from: ۦِؓۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3961 extends AbstractC0772 {

    /* JADX INFO: renamed from: ۥَ */
    public Iterator f13241;

    /* JADX INFO: renamed from: ۥٓ */
    public Serializable f13242;

    /* JADX INFO: renamed from: ۥٖ */
    public /* synthetic */ Object f13243;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ C3223 f13244;

    /* JADX INFO: renamed from: ۦۛ */
    public int f13245;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3961(C3223 c3223, AbstractC0772 abstractC0772) {
        super(abstractC0772);
        this.f13244 = c3223;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        this.f13243 = obj;
        this.f13245 |= Integer.MIN_VALUE;
        return this.f13244.m5949(null, null, this);
    }
}
