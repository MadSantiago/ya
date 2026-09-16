package p000;

import android.os.IBinder;
import android.os.Messenger;
import android.util.SparseArray;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: ۦِٕؒٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3949 extends AbstractC1053 {

    /* JADX INFO: renamed from: ۥؗ */
    public final int f13205;

    /* JADX INFO: renamed from: ۥۗ */
    public final Messenger f13206;

    /* JADX INFO: renamed from: ۦؑ */
    public final /* synthetic */ BinderC4778 f13207;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3949(BinderC4778 binderC4778, IBinder iBinder, int i) {
        super(iBinder);
        this.f13207 = binderC4778;
        this.f13206 = new Messenger(iBinder);
        this.f13205 = i;
    }

    @Override // p000.AbstractC1053
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo2260() {
        BinderC4778 binderC4778 = this.f13207;
        SparseArray sparseArray = binderC4778.f15759;
        int i = this.f13205;
        sparseArray.remove(i);
        Iterator it = binderC4778.f15761.entrySet().iterator();
        while (it.hasNext()) {
            C1137 c1137 = (C1137) ((Map.Entry) it.next()).getValue();
            if (i < 0) {
                c1137.f3976.clear();
            }
            binderC4778.m8160(c1137, i, new RunnableC0029(16, it));
        }
    }
}
