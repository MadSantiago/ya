package p000;

import java.io.FileOutputStream;

/* JADX INFO: renamed from: ۥؘٞؕؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1952 extends AbstractC0772 {

    /* JADX INFO: renamed from: ۥَ */
    public long f6446;

    /* JADX INFO: renamed from: ۥٓ */
    public FileOutputStream f6447;

    /* JADX INFO: renamed from: ۥٖ */
    public /* synthetic */ Object f6448;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ C4992 f6449;

    /* JADX INFO: renamed from: ۦۛ */
    public int f6450;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1952(C4992 c4992, AbstractC0772 abstractC0772) {
        super(abstractC0772);
        this.f6449 = c4992;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        this.f6448 = obj;
        this.f6450 |= Integer.MIN_VALUE;
        return this.f6449.m8384(null, this);
    }
}
