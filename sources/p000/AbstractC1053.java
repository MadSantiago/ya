package p000;

import android.os.IBinder;
import android.os.RemoteException;

/* JADX INFO: renamed from: ۥُؔۢؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1053 implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: ۥۣ */
    public final IBinder f3723;

    public AbstractC1053(IBinder iBinder) throws RemoteException {
        this.f3723 = iBinder;
        iBinder.linkToDeath(this, 0);
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.f3723.unlinkToDeath(this, 0);
        AbstractC1436.m3064(new RunnableC0029(7, this));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public abstract void mo2260();
}
