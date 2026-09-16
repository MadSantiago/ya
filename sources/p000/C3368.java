package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.RemoteException;
import android.util.ArrayMap;
import android.util.Pair;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ۦؖؖٚ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3368 implements Handler.Callback {

    /* JADX INFO: renamed from: ۦۙ */
    public static C3368 f11247;

    /* JADX INFO: renamed from: ۥۗ */
    public C3209 f11251;

    /* JADX INFO: renamed from: ۥۣ */
    public C3209 f11252;

    /* JADX INFO: renamed from: ۥؗ */
    public int f11248 = 0;

    /* JADX INFO: renamed from: ۦؑ */
    public final ArrayList f11253 = new ArrayList();

    /* JADX INFO: renamed from: ۥُ */
    public final ArrayMap f11249 = new ArrayMap();

    /* JADX INFO: renamed from: ۥّ */
    public final ArrayMap f11250 = new ArrayMap();

    /* JADX INFO: renamed from: ۥؗ */
    public static C5459 m6123(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            C1078.m2272("The intent does not have a component set");
            return null;
        }
        if (component.getPackageName().equals(AbstractC2774.m5176().getPackageName())) {
            return new C5459(component, intent.hasCategory(AbstractC0282.f1030));
        }
        C1078.m2272("RootServices outside of the app are not supported");
        return null;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            m6124(new C5459((ComponentName) message.obj, message.arg1 != 0));
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m6124(C5459 c5459) {
        C1356 c1356 = (C1356) this.f11249.remove(c5459);
        if (c1356 != null) {
            Iterator it = this.f11250.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                C2087 c2087 = (C2087) entry.getValue();
                if (c1356 == ((C1356) ((Pair) c2087).first)) {
                    c2087.m4027((ServiceConnection) entry.getKey());
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C5459 m6125(Intent intent, Executor executor, final ServiceConnection serviceConnection) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            C1078.m2276("This method can only be called on the main thread");
            return null;
        }
        final C5459 c5459M6123 = m6123(intent);
        ArrayMap arrayMap = this.f11249;
        C1356 c1356 = (C1356) arrayMap.get(c5459M6123);
        final int i = 1;
        ArrayMap arrayMap2 = this.f11250;
        if (c1356 != null) {
            arrayMap2.put(serviceConnection, new C2087(c1356, executor));
            c1356.f4663++;
            final IBinder iBinder = c1356.f4661;
            final int i2 = 0;
            executor.execute(new Runnable() { // from class: ۦْۙؗ۠
                @Override // java.lang.Runnable
                public final void run() {
                    int i3 = i2;
                    IBinder iBinder2 = iBinder;
                    C5459 c5459 = c5459M6123;
                    ServiceConnection serviceConnection2 = serviceConnection;
                    switch (i3) {
                        case 0:
                            serviceConnection2.onServiceConnected((ComponentName) ((Pair) c5459).first, iBinder2);
                            break;
                        default:
                            serviceConnection2.onServiceConnected((ComponentName) ((Pair) c5459).first, iBinder2);
                            break;
                    }
                }
            });
            return null;
        }
        C3209 c3209 = ((Boolean) ((Pair) c5459M6123).second).booleanValue() ? this.f11251 : this.f11252;
        if (c3209 == null) {
            return c5459M6123;
        }
        try {
            final IBinder iBinderMo1584 = c3209.f10767.mo1584(intent);
            if (iBinderMo1584 == null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    executor.execute(new RunnableC5689(19, serviceConnection, c5459M6123));
                }
                return null;
            }
            C1356 c1357 = new C1356(c5459M6123, iBinderMo1584, c3209);
            arrayMap2.put(serviceConnection, new C2087(c1357, executor));
            arrayMap.put(c5459M6123, c1357);
            executor.execute(new Runnable() { // from class: ۦْۙؗ۠
                @Override // java.lang.Runnable
                public final void run() {
                    int i3 = i;
                    IBinder iBinder2 = iBinderMo1584;
                    C5459 c5459 = c5459M6123;
                    ServiceConnection serviceConnection2 = serviceConnection;
                    switch (i3) {
                        case 0:
                            serviceConnection2.onServiceConnected((ComponentName) ((Pair) c5459).first, iBinder2);
                            break;
                        default:
                            serviceConnection2.onServiceConnected((ComponentName) ((Pair) c5459).first, iBinder2);
                            break;
                    }
                }
            });
            return null;
        } catch (RemoteException e) {
            AbstractC2774.m5205("IPC", e);
            c3209.binderDied();
            return c5459M6123;
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [ۦُؗۦؘ] */
    /* JADX INFO: renamed from: ۦؑ */
    public final C3928 m6126(final ComponentName componentName, final String str) {
        final Context contextM5176 = AbstractC2774.m5176();
        if ((this.f11248 & 4) == 0) {
            contextM5176.registerReceiver(new C4269(this), new IntentFilter("com.topjohnwu.superuser.RECEIVER_BROADCAST"), "android.permission.BROADCAST_PACKAGE_REMOVED", null, 4);
            this.f11248 |= 4;
        }
        return new InterfaceC0964(contextM5176, str, componentName) { // from class: ۦُؗۦؘ

            /* JADX INFO: renamed from: ۥۗ */
            public final /* synthetic */ ComponentName f13108;

            /* JADX INFO: renamed from: ۥۣ */
            public final /* synthetic */ String f13109;

            {
                this.f13109 = str;
                this.f13108 = componentName;
            }

            /* JADX WARN: Code duplicated, block: B:41:0x00dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:51:? A[SYNTHETIC] */
            @Override // p000.InterfaceC0964
            /* JADX INFO: renamed from: ۥۗ */
            public final void mo2002(OutputStream outputStream, InputStream inputStream, InputStream inputStream2) throws IOException {
                String str2;
                Context contextCreateDeviceProtectedStorageContext = AbstractC2774.m5176().createDeviceProtectedStorageContext();
                File file = new File(contextCreateDeviceProtectedStorageContext.getCacheDir(), "main.jar");
                InputStream inputStreamOpen = contextCreateDeviceProtectedStorageContext.getResources().getAssets().open("main.jar");
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[65536];
                        while (true) {
                            int i = inputStreamOpen.read(bArr);
                            if (i <= 0) {
                                break;
                            } else {
                                fileOutputStream.write(bArr, 0, i);
                            }
                            if (inputStreamOpen != null) {
                                throw th;
                            }
                            try {
                                inputStreamOpen.close();
                                throw th;
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                                throw th;
                            }
                        }
                        fileOutputStream.close();
                        inputStreamOpen.close();
                        String str3 = this.f13109;
                        if (str3.equals("daemon")) {
                            str2 = "--nice-name=" + contextCreateDeviceProtectedStorageContext.getPackageName() + ":root:daemon";
                        } else if (str3.equals("start")) {
                            Locale locale = Locale.ROOT;
                            str2 = "--nice-name=" + contextCreateDeviceProtectedStorageContext.getPackageName() + ":root:" + (Process.myUid() / 100000);
                        } else {
                            str2 = "";
                        }
                        outputStream.write(String.format(Locale.ROOT, "(%s CLASSPATH=%s %s %s /system/bin %s com.topjohnwu.superuser.internal.RootServerMain '%s' %d %s >/dev/null 2>&1)&", "", file, "/system/bin/app_process".concat(Process.is64Bit() ? "64" : "32"), " -Xnoimage-dex2oat", str2, this.f13108.flattenToString(), Integer.valueOf(Process.myUid()), str3).getBytes(StandardCharsets.UTF_8));
                        outputStream.write(10);
                        outputStream.flush();
                    } catch (Throwable th2) {
                        try {
                            fileOutputStream.close();
                            throw th2;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                    }
                } catch (Throwable th4) {
                    if (inputStreamOpen != null) {
                        throw th4;
                    }
                    inputStreamOpen.close();
                    throw th4;
                }
            }
        };
    }
}
