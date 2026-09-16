package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;
import p000.BinderC4301;
import p000.RemoteCallbackListC4279;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: ۦۨ */
    public int f241;

    /* JADX INFO: renamed from: ۦ۟ */
    public final LinkedHashMap f240 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۥْ */
    public final RemoteCallbackListC4279 f238 = new RemoteCallbackListC4279(this);

    /* JADX INFO: renamed from: ۥٓ */
    public final BinderC4301 f239 = new BinderC4301(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f239;
    }
}
