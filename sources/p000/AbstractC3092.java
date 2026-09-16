package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: ۦؙؒؒۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3092 {

    /* JADX INFO: renamed from: ۥۣ */
    public final int f10374;

    public AbstractC3092(int i) {
        this.f10374 = i;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static Status m5679(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public abstract void mo3475(Status status);

    /* JADX INFO: renamed from: ۥُ */
    public abstract void mo3476(C3184 c3184);

    /* JADX INFO: renamed from: ۥّ */
    public abstract void mo3477(C2346 c2346, boolean z);

    /* JADX INFO: renamed from: ۥۗ */
    public abstract C2274[] mo3478(C3184 c3184);

    /* JADX INFO: renamed from: ۥۣ */
    public abstract boolean mo3480(C3184 c3184);

    /* JADX INFO: renamed from: ۦؑ */
    public abstract void mo3481(Exception exc);
}
