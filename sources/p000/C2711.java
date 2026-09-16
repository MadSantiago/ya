package p000;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ۥۥؑؖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2711 implements InterfaceC5641 {

    /* JADX INFO: renamed from: ۥَ */
    public final Object f8979;

    /* JADX INFO: renamed from: ۥْ */
    public final Object f8980;

    /* JADX INFO: renamed from: ۥٓ */
    public final Object f8981;

    /* JADX INFO: renamed from: ۥٖ */
    public final Object f8982;

    /* JADX INFO: renamed from: ۦٗ */
    public final Object f8983;

    /* JADX INFO: renamed from: ۦ۟ */
    public final Object f8984;

    /* JADX INFO: renamed from: ۦۨ */
    public Object f8985;

    public C2711(Context context) {
        String string;
        String str = ((C5498) C1397.f4794.m2962(context)).f18158;
        this.f8985 = str;
        File filesDir = context.getFilesDir();
        this.f8984 = filesDir;
        if (str.isEmpty()) {
            string = ".com.google.firebase.crashlytics.files.v1";
        } else {
            StringBuilder sb = new StringBuilder(".crashlytics.v3");
            sb.append(File.separator);
            sb.append(str.length() > 40 ? AbstractC2133.m4144(str) : str.replaceAll("[^a-zA-Z0-9.]", "_"));
            string = sb.toString();
        }
        File file = new File(filesDir, string);
        m5032(file);
        this.f8980 = file;
        File file2 = new File(file, "open-sessions");
        m5032(file2);
        this.f8981 = file2;
        File file3 = new File(file, "reports");
        m5032(file3);
        this.f8979 = file3;
        File file4 = new File(file, "priority-reports");
        m5032(file4);
        this.f8982 = file4;
        File file5 = new File(file, "native-reports");
        m5032(file5);
        this.f8983 = file5;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static synchronized void m5032(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return;
                }
                String str = "Unexpected non-directory file: " + file + "; deleting file and creating new directory.";
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str, null);
                }
                file.delete();
            }
            if (!file.mkdirs()) {
                Log.e("FirebaseCrashlytics", "Could not create Crashlytics-specific directory: " + file, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥُ */
    public static List m5033(Object[] objArr) {
        return objArr == null ? Collections.EMPTY_LIST : Arrays.asList(objArr);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static boolean m5034(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                m5034(file2);
            }
        }
        return file.delete();
    }

    @Override // p000.InterfaceC4895
    public Object get() {
        return new C0909((C1802) ((InterfaceC5641) this.f8985).get(), (C1862) ((InterfaceC5641) this.f8984).get(), (C3086) ((InterfaceC5641) this.f8980).get(), (C3729) ((InterfaceC5641) this.f8981).get(), (InterfaceC1015) ((InterfaceC5641) this.f8979).get(), (C4590) ((InterfaceC5641) this.f8982).get(), (InterfaceC3534) ((InterfaceC5641) this.f8983).get());
    }

    /* JADX INFO: renamed from: ۥّ */
    public void m5035(String str) {
        C1405 c1405 = (C1405) this.f8979;
        synchronized (c1405) {
            try {
                if (((C5911) ((AtomicMarkableReference) c1405.f4836).getReference()).m9737(str)) {
                    AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) c1405.f4836;
                    atomicMarkableReference.set((C5911) atomicMarkableReference.getReference(), true);
                    RunnableC0029 runnableC0029 = new RunnableC0029(23, c1405);
                    AtomicReference atomicReference = (AtomicReference) c1405.f4835;
                    while (!atomicReference.compareAndSet(null, runnableC0029)) {
                        if (atomicReference.get() != null) {
                            return;
                        }
                    }
                    ((ExecutorC2291) ((C2808) ((C2711) c1405.f4838).f8980).f9376).m4346(runnableC0029);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public File m5036(String str, String str2) {
        File file = new File((File) this.f8981, str);
        file.mkdirs();
        return new File(file, str2);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public void m5037(String str) {
        File file = new File((File) this.f8984, str);
        if (file.exists() && m5034(file)) {
            String str2 = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
        }
    }

    public C2711(InterfaceC5641 interfaceC5641, InterfaceC5641 interfaceC5642, InterfaceC5641 interfaceC5643, InterfaceC5641 interfaceC5644, InterfaceC5641 interfaceC5645, InterfaceC5641 interfaceC5646, InterfaceC5641 interfaceC5647) {
        this.f8985 = interfaceC5641;
        this.f8984 = interfaceC5642;
        this.f8980 = interfaceC5643;
        this.f8981 = interfaceC5644;
        this.f8979 = interfaceC5645;
        this.f8982 = interfaceC5646;
        this.f8983 = interfaceC5647;
    }

    public C2711(C3571 c3571) {
        this.f8985 = (C5728) c3571.f11831;
        this.f8984 = (AbstractC1605) c3571.f11830;
        this.f8980 = (C4369) c3571.f11826;
        this.f8981 = (C4992) c3571.f11827;
        this.f8979 = (C4992) c3571.f11825;
        this.f8982 = (C4992) c3571.f11828;
        this.f8983 = (C3121) c3571.f11829;
    }

    public C2711(String str, C2711 c2711, C2808 c2808) {
        this.f8981 = new C1405(this, false);
        this.f8979 = new C1405(this, true);
        this.f8982 = new C1115(1, false);
        this.f8983 = new AtomicMarkableReference(null, false);
        this.f8985 = str;
        this.f8984 = new C1640(c2711);
        this.f8980 = c2808;
    }
}
