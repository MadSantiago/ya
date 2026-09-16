package p000;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: renamed from: ۥّٚؒؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC1711 extends HandlerC0645 {

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ AbstractC4150 f5684;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC1711(AbstractC4150 abstractC4150, Looper looper) {
        super(looper, 3);
        this.f5684 = abstractC4150;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        AbstractC2511 abstractC2511;
        AbstractC4150 abstractC4150 = this.f5684;
        int i = abstractC4150.f13825.get();
        int i2 = message.arg1;
        int i3 = message.what;
        if (i != i2) {
            if ((i3 == 2 || i3 == 1 || i3 == 7) && (abstractC2511 = (AbstractC2511) message.obj) != null) {
                synchronized (abstractC2511) {
                    abstractC2511.f8335 = null;
                }
                AbstractC4150 abstractC4151 = abstractC2511.f8331;
                synchronized (abstractC4151.f13810) {
                    abstractC4151.f13810.remove(abstractC2511);
                }
                return;
            }
            return;
        }
        if ((i3 == 1 || i3 == 7 || i3 == 4 || i3 == 5) && !abstractC4150.m7330()) {
            AbstractC2511 abstractC2512 = (AbstractC2511) message.obj;
            if (abstractC2512 != null) {
                synchronized (abstractC2512) {
                    abstractC2512.f8335 = null;
                }
                AbstractC4150 abstractC4152 = abstractC2512.f8331;
                synchronized (abstractC4152.f13810) {
                    abstractC4152.f13810.remove(abstractC2512);
                }
                return;
            }
            return;
        }
        int i4 = message.what;
        if (i4 == 4) {
            abstractC4150.f13822 = new C2612(message.arg2, null, null);
            if (!abstractC4150.f13820 && !TextUtils.isEmpty(abstractC4150.mo4541()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(abstractC4150.mo4541());
                    if (!abstractC4150.f13820) {
                        abstractC4150.m7334(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            C2612 c2612 = abstractC4150.f13822;
            if (c2612 == null) {
                c2612 = new C2612(8, null, null);
            }
            abstractC4150.f13826.mo4838(c2612);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 5) {
            C2612 c2613 = abstractC4150.f13822;
            if (c2613 == null) {
                c2613 = new C2612(8, null, null);
            }
            abstractC4150.f13826.mo4838(c2613);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 3) {
            Object obj = message.obj;
            abstractC4150.f13826.mo4838(new C2612(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null, null));
            System.currentTimeMillis();
            return;
        }
        if (i4 == 6) {
            abstractC4150.m7334(5, null);
            InterfaceC0500 interfaceC0500 = abstractC4150.f13811;
            if (interfaceC0500 != null) {
                interfaceC0500.mo1144(message.arg2);
            }
            System.currentTimeMillis();
            abstractC4150.m7342(5, 1, null);
            return;
        }
        if (i4 == 2 && !abstractC4150.m7337()) {
            AbstractC2511 abstractC2513 = (AbstractC2511) message.obj;
            if (abstractC2513 != null) {
                synchronized (abstractC2513) {
                    abstractC2513.f8335 = null;
                }
                AbstractC4150 abstractC4153 = abstractC2513.f8331;
                synchronized (abstractC4153.f13810) {
                    abstractC4153.f13810.remove(abstractC2513);
                }
                return;
            }
            return;
        }
        int i5 = message.what;
        if (i5 != 2 && i5 != 1 && i5 != 7) {
            Log.wtf("GmsClient", AbstractC5078.m8673(i5, "Don't know how to handle message: ", new StringBuilder(String.valueOf(i5).length() + 34)), new Exception());
            return;
        }
        AbstractC2511 abstractC2514 = (AbstractC2511) message.obj;
        synchronized (abstractC2514) {
            try {
                bool = abstractC2514.f8335;
                if (abstractC2514.f8334) {
                    String string = abstractC2514.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(string);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            AbstractC4150 abstractC4154 = abstractC2514.f8333;
            int i6 = abstractC2514.f8336;
            if (i6 != 0) {
                abstractC4154.m7334(1, null);
                Bundle bundle = abstractC2514.f8332;
                abstractC2514.mo1920(new C2612(i6, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
            } else if (!abstractC2514.mo1921()) {
                abstractC4154.m7334(1, null);
                abstractC2514.mo1920(new C2612(8, null, null));
            }
        }
        synchronized (abstractC2514) {
            abstractC2514.f8334 = true;
        }
        synchronized (abstractC2514) {
            abstractC2514.f8335 = null;
        }
        AbstractC4150 abstractC4155 = abstractC2514.f8331;
        synchronized (abstractC4155.f13810) {
            abstractC4155.f13810.remove(abstractC2514);
        }
    }
}
