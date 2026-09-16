package p000;

import java.io.IOException;

/* JADX INFO: renamed from: ۥؘٜۡؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2549 extends AbstractC1127 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ C4162 f8502;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ long f8503;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ C1314 f8504;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ C1314 f8505;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ C1314 f8506;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C5662 f8507;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2549(C5662 c5662, long j, C1314 c1314, C4162 c4162, C1314 c1315, C1314 c1316) {
        super(2);
        this.f8507 = c5662;
        this.f8503 = j;
        this.f8504 = c1314;
        this.f8502 = c4162;
        this.f8505 = c1315;
        this.f8506 = c1316;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) throws IOException {
        int iIntValue = ((Number) obj).intValue();
        long jLongValue = ((Number) obj2).longValue();
        if (iIntValue == 1) {
            C5662 c5662 = this.f8507;
            if (c5662.f18631) {
                C5028.m8448("bad zip: zip64 extra repeated");
                return null;
            }
            c5662.f18631 = true;
            if (jLongValue < this.f8503) {
                C5028.m8448("bad zip: zip64 extra too short");
                return null;
            }
            C1314 c1314 = this.f8504;
            long jM7358 = c1314.f4535;
            C4162 c4162 = this.f8502;
            if (jM7358 == 4294967295L) {
                jM7358 = c4162.m7358();
            }
            c1314.f4535 = jM7358;
            C1314 c1315 = this.f8505;
            c1315.f4535 = c1315.f4535 == 4294967295L ? c4162.m7358() : 0L;
            C1314 c1316 = this.f8506;
            c1316.f4535 = c1316.f4535 == 4294967295L ? c4162.m7358() : 0L;
        }
        return C2358.f7817;
    }
}
