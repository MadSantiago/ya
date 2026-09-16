package p000;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: renamed from: ۦٖٖؑؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RemoteCallbackListC4279 extends RemoteCallbackList {

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ MultiInstanceInvalidationService f14163;

    public RemoteCallbackListC4279(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f14163 = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        this.f14163.f240.remove((Integer) obj);
    }
}
