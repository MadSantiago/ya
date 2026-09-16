package p000;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.SparseArray;

/* JADX INFO: renamed from: ۦٍؕؑٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3255 implements Runnable {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f10930;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ Object f10931;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f10932;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f10933;

    public /* synthetic */ RunnableC3255(int i, int i2, Object obj, Object obj2) {
        this.f10933 = i2;
        this.f10930 = obj;
        this.f10932 = i;
        this.f10931 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f10933;
        Object obj = this.f10931;
        int i2 = this.f10932;
        Object obj2 = this.f10930;
        switch (i) {
            case 0:
                ((C0721) obj2).f2633.m5749(i2, obj);
                break;
            default:
                BinderC4778 binderC4778 = (BinderC4778) obj2;
                IBinder iBinder = (IBinder) obj;
                SparseArray sparseArray = binderC4778.f15759;
                if (sparseArray.get(i2) == null) {
                    try {
                        sparseArray.put(i2, new C3949(binderC4778, iBinder, i2));
                        AbstractC1436.f4924.removeCallbacks(binderC4778);
                    } catch (RemoteException e) {
                        AbstractC2774.m5205("IPC", e);
                    }
                    break;
                }
                break;
        }
    }
}
