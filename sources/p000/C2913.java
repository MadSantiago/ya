package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: ۥَۨؓؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2913 implements InterfaceC2895 {

    /* JADX INFO: renamed from: ۥۗ */
    public final Object f9707;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f9708;

    public C2913(C2346 c2346) {
        this.f9708 = 1;
        this.f9707 = new LinkedHashSet();
        c2346.m4413("androidx.savedstate.Restarter", this);
    }

    @Override // p000.InterfaceC2895
    /* JADX INFO: renamed from: ۥۣ */
    public final Bundle mo5438() {
        int i = this.f9708;
        Object obj = this.f9707;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                ((AbstractActivityC2747) obj).m5101();
                return bundle;
            default:
                Bundle bundleM7904 = AbstractC4554.m7904((C3869[]) Arrays.copyOf(new C3869[0], 0));
                List listM2039 = AbstractC0973.m2039((LinkedHashSet) obj);
                bundleM7904.putStringArrayList("classes_to_restore", listM2039 instanceof ArrayList ? (ArrayList) listM2039 : new ArrayList<>(listM2039));
                return bundleM7904;
        }
    }

    public C2913(AbstractActivityC2747 abstractActivityC2747) {
        this.f9708 = 0;
        this.f9707 = abstractActivityC2747;
    }
}
