package p000;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: renamed from: ۥِٟؑٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1984 implements InterfaceC1861, InterfaceC4409 {

    /* JADX INFO: renamed from: ۥْ */
    public static volatile C1984 f6549;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final Object f6550 = new Object();

    /* JADX INFO: renamed from: ۦۨ */
    public int f6551;

    public C1984() {
        this.f6551 = 0;
    }

    /* JADX INFO: renamed from: ۦِ */
    public static C1984 m3874() {
        C1984 c1984;
        synchronized (f6550) {
            try {
                if (f6549 == null) {
                    f6549 = new C1984(3);
                }
                c1984 = f6549;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1984;
    }

    /* JADX INFO: renamed from: ۦۚ */
    public static String m3875(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    @Override // p000.InterfaceC4409
    /* JADX INFO: renamed from: ۥؗ */
    public int mo3876(Context context, String str, boolean z) {
        return 0;
    }

    /* JADX INFO: renamed from: ۥُ */
    public C3267 m3877(Process process) {
        try {
            C3267 c3267 = new C3267(this, process);
            synchronized (AbstractC2552.class) {
                if (AbstractC2552.f8514) {
                    C3267[] c3267Arr = AbstractC2552.f8516;
                    synchronized (c3267Arr) {
                        c3267Arr[0] = c3267;
                    }
                }
            }
            return c3267;
        } catch (IOException e) {
            throw new C0887("Unable to create a shell!", e);
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public void m3878(String str, String str2) {
        if (this.f6551 <= 3) {
            Log.d(str, str2);
        }
    }

    @Override // p000.InterfaceC1861
    /* JADX INFO: renamed from: ۥٖ */
    public int mo692() {
        return 0;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public void m3879(String str, String str2, Throwable th) {
        if (this.f6551 <= 6) {
            Log.e(str, str2, th);
        }
    }

    @Override // p000.InterfaceC4409
    /* JADX INFO: renamed from: ۦؑ */
    public int mo3880(Context context, String str) {
        return this.f6551;
    }

    @Override // p000.InterfaceC1861
    /* JADX INFO: renamed from: ۦؚ */
    public int mo696() {
        return this.f6551;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: ۦٌ */
    public C3267 m3881() {
        C3267 c3267M3882;
        if ((this.f6551 & 2) == 2) {
            try {
                c3267M3882 = m3882("su", "--mount-master");
                try {
                    if (!c3267M3882.m6030()) {
                        c3267M3882 = null;
                    }
                } catch (C0887 unused) {
                }
            } catch (C0887 unused2) {
            }
        } else {
            c3267M3882 = null;
        }
        if (c3267M3882 == null) {
            try {
                c3267M3882 = m3882("su");
                c3267M3882 = c3267M3882.m6030() ? c3267M3882 : null;
            } catch (C0887 unused3) {
            }
        }
        if (c3267M3882 != null) {
            return c3267M3882;
        }
        synchronized (AbstractC2774.class) {
            AbstractC2774.f9243 = 0;
        }
        return m3882("sh");
    }

    @Override // p000.InterfaceC2707
    /* JADX INFO: renamed from: ۦٗ */
    public AbstractC1814 mo700(long j, AbstractC1814 abstractC1814, AbstractC1814 abstractC1815, AbstractC1814 abstractC1816) {
        return j < ((long) this.f6551) * 1000000 ? abstractC1814 : abstractC1815;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public C3267 m3882(String... strArr) {
        try {
            TextUtils.join(" ", strArr);
            return m3877(Runtime.getRuntime().exec(strArr));
        } catch (IOException e) {
            throw new C0887("Unable to create a shell!", e);
        }
    }

    /* JADX INFO: renamed from: ۦۗ */
    public void m3883(String str, String str2) {
        if (this.f6551 <= 4) {
            Log.i(str, str2);
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public void m3884(String str, String str2) {
        if (this.f6551 <= 6) {
            Log.e(str, str2);
        }
    }

    /* JADX INFO: renamed from: ۦۨ */
    public void m3885(String str, String str2) {
        if (this.f6551 <= 5) {
            Log.w(str, str2);
        }
    }

    public /* synthetic */ C1984(int i) {
        this.f6551 = i;
    }

    @Override // p000.InterfaceC2707
    /* JADX INFO: renamed from: ۥَ */
    public AbstractC1814 mo687(long j, AbstractC1814 abstractC1814, AbstractC1814 abstractC1815, AbstractC1814 abstractC1816) {
        return abstractC1816;
    }
}
