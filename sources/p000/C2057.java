package p000;

import android.os.Bundle;
import java.util.HashSet;

/* JADX INFO: renamed from: ۥۖؔؔۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2057 implements InterfaceC4264 {

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ Object f6775;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f6776;

    public /* synthetic */ C2057(int i, Object obj) {
        this.f6776 = i;
        this.f6775 = obj;
    }

    @Override // p000.InterfaceC4264
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo4010(String str, String str2, Bundle bundle, long j) {
        int i = this.f6776;
        Object obj = this.f6775;
        switch (i) {
            case 0:
                C2346 c2346 = (C2346) obj;
                if (((HashSet) c2346.f7786).contains(str2)) {
                    Bundle bundle2 = new Bundle();
                    AbstractC4821 abstractC4821 = AbstractC1389.f4746;
                    String strM1948 = AbstractC0949.m1948(str2, AbstractC1605.f5399, AbstractC1605.f5396);
                    if (strM1948 != null) {
                        str2 = strM1948;
                    }
                    bundle2.putString("events", str2);
                    ((C5002) c2346.f7785).m8402(2, bundle2);
                    break;
                }
                break;
            default:
                if (str != null && !AbstractC1389.f4746.contains(str2)) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("name", str2);
                    bundle3.putLong("timestampInMillis", j);
                    bundle3.putBundle("params", bundle);
                    ((C5002) ((C1039) obj).f3672).m8402(3, bundle3);
                    break;
                }
                break;
        }
    }
}
