package p000;

import java.io.FileInputStream;
import java.nio.channels.FileLock;

/* JADX INFO: renamed from: ۥّٚؗۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1746 extends AbstractC0772 {

    /* JADX INFO: renamed from: ۥَ */
    public FileInputStream f5808;

    /* JADX INFO: renamed from: ۥٓ */
    public C1387 f5809;

    /* JADX INFO: renamed from: ۥٖ */
    public FileLock f5810;

    /* JADX INFO: renamed from: ۥۖ */
    public final /* synthetic */ C5155 f5811;

    /* JADX INFO: renamed from: ۦٕ */
    public int f5812;

    /* JADX INFO: renamed from: ۦٗ */
    public boolean f5813;

    /* JADX INFO: renamed from: ۦۛ */
    public /* synthetic */ Object f5814;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1746(C5155 c5155, AbstractC0772 abstractC0772) {
        super(abstractC0772);
        this.f5811 = c5155;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        this.f5814 = obj;
        this.f5812 |= Integer.MIN_VALUE;
        return this.f5811.mo5827(null, this);
    }
}
