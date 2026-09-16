package p000;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: ۥّْؕؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1218 implements Runnable {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C2588 f4207;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f4208;

    public /* synthetic */ RunnableC1218(C2588 c2588, int i) {
        this.f4208 = i;
        this.f4207 = c2588;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2529 c2529M6133;
        C2529 c2529M4886;
        int i = this.f4208;
        C2588 c2588 = this.f4207;
        switch (i) {
            case 0:
                c2588.m4887();
                return;
            case 1:
                c2588.m4887();
                return;
            default:
                Object obj = C2588.f8634;
                synchronized (obj) {
                    try {
                        C0377 c0377 = c2588.f8640;
                        c0377.m825();
                        C5002 c5002M8391 = C5002.m8391(c0377.f1410);
                        try {
                            c2529M6133 = c2588.f8635.m6133();
                            if (c5002M8391 != null) {
                                c5002M8391.m8404();
                            }
                        } catch (Throwable th) {
                            if (c5002M8391 != null) {
                                c5002M8391.m8404();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    int i2 = c2529M6133.f8375;
                    boolean z = false;
                    if (i2 == 5) {
                        c2529M4886 = c2588.m4886(c2529M6133);
                    } else {
                        if (i2 == 3) {
                            c2529M4886 = c2588.m4886(c2529M6133);
                        } else if (!c2588.f8641.m5114(c2529M6133)) {
                            return;
                        } else {
                            c2529M4886 = c2588.m4885(c2529M6133);
                        }
                    }
                    synchronized (obj) {
                        try {
                            C0377 c0378 = c2588.f8640;
                            c0378.m825();
                            C5002 c5002M8392 = C5002.m8391(c0378.f1410);
                            try {
                                c2588.f8635.m6134(c2529M4886);
                                if (c5002M8392 != null) {
                                    c5002M8392.m8404();
                                }
                            } catch (Throwable th3) {
                                if (c5002M8392 != null) {
                                    c5002M8392.m8404();
                                }
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    synchronized (c2588) {
                        try {
                            boolean z2 = c2529M4886.f8375 == 4;
                            String str = c2529M4886.f8376;
                            if (z2 && !TextUtils.isEmpty(str)) {
                                if (TextUtils.equals(c2529M6133.f8376, str)) {
                                    z = !(c2529M6133.f8375 == 4);
                                } else {
                                    z = true;
                                }
                            }
                            if (z) {
                                Iterator it = c2588.f8642.iterator();
                                if (it.hasNext()) {
                                    if (it.next() != null) {
                                        throw new ClassCastException();
                                    }
                                    throw null;
                                }
                            }
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                    if (c2529M4886.f8375 == 4) {
                        String str2 = c2529M4886.f8376;
                        synchronized (c2588) {
                            c2588.f8643 = str2;
                        }
                    }
                    int i3 = c2529M4886.f8375;
                    if (i3 == 5) {
                        c2588.m4889(new C5707());
                        return;
                    } else if (i3 == 2 || i3 == 1) {
                        c2588.m4889(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        c2588.m4888(c2529M4886);
                        return;
                    }
                } catch (C5707 e) {
                    c2588.m4889(e);
                    return;
                }
        }
    }
}
