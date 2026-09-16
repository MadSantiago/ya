package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.UserHandle;
import android.util.ArrayMap;
import android.util.ArraySet;
import android.util.SparseArray;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: ۦٞؑؐؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC4778 extends Binder implements Runnable, InterfaceC2585 {

    /* JADX INFO: renamed from: ۥَ */
    public static BinderC4778 f15758;

    /* JADX INFO: renamed from: ۥْ */
    public final SparseArray f15759;

    /* JADX INFO: renamed from: ۥٓ */
    public final boolean f15760;

    /* JADX INFO: renamed from: ۦ۟ */
    public final ArrayMap f15761;

    /* JADX INFO: renamed from: ۦۨ */
    public final FileObserverC5510 f15762;

    /* JADX INFO: Infinite loop detected, blocks: 7, insns: 0 */
    /* JADX WARN: Multi-variable type inference failed */
    public BinderC4778(Context context) {
        attachInterface(this, "com.topjohnwu.superuser.internal.IRootServiceManager");
        this.f15761 = new ArrayMap();
        this.f15759 = new SparseArray();
        System.getenv("LIBSU_VERBOSE_LOGGING");
        ExecutorService executorService = C3267.f10970;
        AbstractC2774.f9240 = context;
        if (System.getenv("LIBSU_DEBUGGER") == null) {
            FileObserverC5510 fileObserverC5510 = new FileObserverC5510(this, new File(context.getPackageCodePath()));
            this.f15762 = fileObserverC5510;
            fileObserverC5510.startWatching();
            if (!(context instanceof Callable)) {
                C1078.m2272("Expected Context to be Callable");
                throw null;
            }
            try {
                Object[] objArr = (Object[]) ((Callable) context).call();
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                this.f15760 = zBooleanValue;
                if (zBooleanValue) {
                    String packageName = context.getPackageName();
                    int i = AbstractCallableC1817.f6041;
                    String str = "libsu-" + packageName;
                    try {
                        Method method = AbstractC4574.f15083;
                        if (method.getParameterTypes().length == 4) {
                            method.invoke(null, str, this, Boolean.FALSE, 0);
                        } else {
                            method.invoke(null, str, this);
                        }
                    } catch (ReflectiveOperationException e) {
                        AbstractC2774.m5205("IPC", e);
                    }
                }
                m8162(((Integer) objArr[0]).intValue());
                if (this.f15760) {
                    return;
                }
                AbstractC1436.f4924.postDelayed(this, 10000L);
                return;
            } catch (Exception e2) {
                C5028.m8450(e2);
                throw null;
            }
        }
        try {
            AbstractC4574.f15081.invoke(null, context.getPackageName() + ":root", 0);
            while (true) {
                try {
                    Thread.sleep(200L);
                } catch (InterruptedException unused) {
                }
            }
        } catch (ReflectiveOperationException e3) {
            C5028.m8450(e3);
            throw null;
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("com.topjohnwu.superuser.internal.IRootServiceManager");
        }
        if (i == 1598968902) {
            parcel2.writeString("com.topjohnwu.superuser.internal.IRootServiceManager");
            return true;
        }
        if (i == 1) {
            m8162(parcel.readInt());
            return true;
        }
        if (i == 2) {
            mo1581(parcel.readInt(), (ComponentName) (parcel.readInt() != 0 ? ComponentName.CREATOR.createFromParcel(parcel) : null));
            return true;
        }
        if (i == 3) {
            mo1583(parcel.readStrongBinder());
            parcel2.writeNoException();
            return true;
        }
        if (i != 4) {
            if (i != 5) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            mo1582((ComponentName) (parcel.readInt() != 0 ? ComponentName.CREATOR.createFromParcel(parcel) : null));
            return true;
        }
        IBinder iBinderMo1584 = mo1584((Intent) (parcel.readInt() != 0 ? Intent.CREATOR.createFromParcel(parcel) : null));
        parcel2.writeNoException();
        parcel2.writeStrongBinder(iBinderMo1584);
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f15759.size() == 0) {
            System.exit(0);
        }
    }

    @Override // p000.InterfaceC2585
    /* JADX INFO: renamed from: ۥؕ */
    public final void mo1581(int i, ComponentName componentName) {
        if (Binder.getCallingUid() != 0) {
            i = Binder.getCallingUid();
        }
        AbstractC1436.m3064(new RunnableC5307(this, componentName, i, 1));
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m8160(C1137 c1137, int i, Runnable runnable) {
        ArraySet arraySet = c1137.f3976;
        AbstractC0282 abstractC0282 = c1137.f3977;
        boolean zIsEmpty = arraySet.isEmpty();
        ArraySet arraySet2 = c1137.f3976;
        arraySet2.remove(Integer.valueOf(i));
        if (i < 0 || arraySet2.isEmpty()) {
            if (!zIsEmpty) {
                c1137.f3975 = abstractC0282.m603(c1137.f3974);
            }
            boolean z = this.f15760;
            if (i < 0 || !z) {
                abstractC0282.m602();
                runnable.run();
                Iterator it = arraySet2.iterator();
                while (it.hasNext()) {
                    C3949 c3949 = (C3949) this.f15759.get(((Integer) it.next()).intValue());
                    if (c3949 != null) {
                        Message messageObtain = Message.obtain();
                        messageObtain.what = 1;
                        messageObtain.arg1 = z ? 1 : 0;
                        messageObtain.obj = c1137.f3974.getComponent();
                        try {
                            try {
                                c3949.f13206.send(messageObtain);
                            } catch (RemoteException e) {
                                AbstractC2774.m5205("IPC", e);
                            }
                            messageObtain.recycle();
                        } catch (Throwable th) {
                            messageObtain.recycle();
                            throw th;
                        }
                    }
                }
            }
        }
        if (this.f15761.isEmpty()) {
            System.exit(0);
        }
    }

    /* JADX INFO: renamed from: ۥٍ */
    public final void m8161(int i, ComponentName componentName) {
        C1137 c1137 = (C1137) this.f15761.get(componentName);
        if (c1137 == null) {
            return;
        }
        m8160(c1137, i, new RunnableC5585(this, componentName, 1));
    }

    @Override // p000.InterfaceC2585
    /* JADX INFO: renamed from: ۥٕ */
    public final void mo1582(ComponentName componentName) {
        AbstractC1436.m3064(new RunnableC5307(this, componentName, Binder.getCallingUid(), 0));
    }

    @Override // p000.InterfaceC2585
    /* JADX INFO: renamed from: ۥٝ */
    public final void mo1583(IBinder iBinder) {
        AbstractC1436.m3064(new RunnableC3255(Binder.getCallingUid(), 1, this, iBinder));
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m8162(int i) {
        if (Binder.getCallingUid() != 0) {
            i = Binder.getCallingUid();
        }
        Bundle bundle = new Bundle();
        bundle.putBinder("binder", this);
        Intent intent = new Intent("com.topjohnwu.superuser.RECEIVER_BROADCAST").setPackage(AbstractC2774.m5176().getPackageName());
        Method method = AbstractC4574.f15083;
        AbstractC2774.f9240.sendBroadcastAsUser(intent.addFlags(4194304).putExtra("extra.daemon", this.f15760).putExtra("extra.bundle", bundle), UserHandle.getUserHandleForUid(i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        if (r2 == null) goto L12;
     */
    /* JADX INFO: renamed from: ۥۣ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.IBinder m8163(android.content.Intent r6, int r7) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.InstantiationException, java.lang.reflect.InvocationTargetException {
        /*
            r5 = this;
            android.util.SparseArray r0 = r5.f15759
            java.lang.Object r0 = r0.get(r7)
            ۦِٕؒٞ r0 = (p000.C3949) r0
            r1 = 0
            if (r0 != 0) goto Lc
            goto L4c
        Lc:
            android.content.ComponentName r0 = r6.getComponent()
            android.util.ArrayMap r5 = r5.f15761
            java.lang.Object r2 = r5.get(r0)
            ۥّؑؑٔ r2 = (p000.C1137) r2
            if (r2 != 0) goto L4d
            android.content.Context r2 = p000.AbstractC2774.f9240
            java.lang.ClassLoader r3 = r2.getClassLoader()
            java.lang.String r4 = r0.getClassName()
            java.lang.Class r3 = r3.loadClass(r4)
            java.lang.reflect.Constructor r3 = r3.getDeclaredConstructor(r1)
            r4 = 1
            r3.setAccessible(r4)
            java.lang.Object r3 = r3.newInstance(r1)
            java.lang.reflect.Method r4 = p000.AbstractC4574.f15083
            boolean r4 = r3 instanceof android.content.ContextWrapper
            if (r4 == 0) goto L43
            java.lang.reflect.Method r4 = p000.AbstractC4574.f15082     // Catch: java.lang.ReflectiveOperationException -> L43
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.ReflectiveOperationException -> L43
            r4.invoke(r3, r2)     // Catch: java.lang.ReflectiveOperationException -> L43
        L43:
            java.lang.Object r5 = r5.get(r0)
            r2 = r5
            ۥّؑؑٔ r2 = (p000.C1137) r2
            if (r2 != 0) goto L4d
        L4c:
            return r1
        L4d:
            ۥۣؒؗۘ r5 = r2.f3977
            android.os.IBinder r1 = r2.f3978
            if (r1 == 0) goto L60
            r0.getClassName()
            boolean r6 = r2.f3975
            if (r6 == 0) goto L6f
            android.content.Intent r6 = r2.f3974
            r5.m601(r6)
            goto L6f
        L60:
            r0.getClassName()
            android.os.IBinder r5 = r5.mo604(r6)
            r2.f3978 = r5
            android.content.Intent r5 = r6.cloneFilter()
            r2.f3974 = r5
        L6f:
            android.util.ArraySet r5 = r2.f3976
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r5.add(r6)
            android.os.IBinder r5 = r2.f3978
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.BinderC4778.m8163(android.content.Intent, int):android.os.IBinder");
    }

    @Override // p000.InterfaceC2585
    /* JADX INFO: renamed from: ۦٟ */
    public final IBinder mo1584(Intent intent) {
        IBinder[] iBinderArr = new IBinder[1];
        RunnableC5382 runnableC5382 = new RunnableC5382(Binder.getCallingUid(), 0, this, iBinderArr, intent);
        Handler handler = AbstractC1436.f4924;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnableC5382.run();
        } else {
            RunnableC5812 runnableC5812 = new RunnableC5812();
            runnableC5812.f19136 = runnableC5382;
            AbstractC1436.f4924.post(runnableC5812);
            synchronized (runnableC5812) {
                while (runnableC5812.f19136 != null) {
                    try {
                        runnableC5812.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
        return iBinderArr[0];
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
