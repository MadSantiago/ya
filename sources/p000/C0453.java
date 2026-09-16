package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ۥٕؕؓٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0453 extends AbstractC0162 {

    /* JADX INFO: renamed from: ۥؗ */
    public final /* synthetic */ ArrayList f1647;

    /* JADX INFO: renamed from: ۦؑ */
    public final /* synthetic */ Matrix f1648;

    public C0453(ArrayList arrayList, Matrix matrix) {
        this.f1647 = arrayList;
        this.f1648 = matrix;
    }

    @Override // p000.AbstractC0162
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo345(Matrix matrix, C5796 c5796, int i, Canvas canvas) {
        Iterator it = this.f1647.iterator();
        while (it.hasNext()) {
            ((AbstractC0162) it.next()).mo345(this.f1648, c5796, i, canvas);
        }
    }
}
