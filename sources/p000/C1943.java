package p000;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ۥٞؓ٘ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1943 extends AbstractC5568 {

    /* JADX INFO: renamed from: ۦؚ */
    public final /* synthetic */ int f6402;

    public /* synthetic */ C1943(int i) {
        this.f6402 = i;
    }

    @Override // p000.AbstractC5568
    /* JADX INFO: renamed from: ۦٖ */
    public final Object mo3805(Intent intent, int i) {
        switch (this.f6402) {
            case 0:
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i2 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i2 == 0));
                        }
                        List listM524 = AbstractC0246.m524(stringArrayExtra);
                        Iterator it = ((ArrayList) listM524).iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList2 = new ArrayList(Math.min(AbstractC5573.m9402(listM524, 10), AbstractC5573.m9402(arrayList, 10)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList2.add(new C3869(it.next(), it2.next()));
                        }
                        return AbstractC4554.m7913(arrayList2);
                    }
                }
                return C0204.f751;
            case 1:
                return new C2233(intent, i);
            default:
                return new C2233(intent, i);
        }
    }
}
