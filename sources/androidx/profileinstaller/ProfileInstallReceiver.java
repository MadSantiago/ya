package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Arrays;
import p000.AbstractC0487;
import p000.AbstractC1631;
import p000.AbstractC2133;
import p000.AbstractC2552;
import p000.AbstractC4361;
import p000.C0721;
import p000.C1078;
import p000.C2754;
import p000.C3121;
import p000.ExecutorC4322;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    /* JADX WARN: Code duplicated, block: B:104:0x0186 A[Catch: all -> 0x0194, TRY_LEAVE, TryCatch #26 {all -> 0x0194, blocks: (B:102:0x017a, B:104:0x0186, B:113:0x0197), top: B:265:0x017a, outer: #27 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x0197 A[Catch: all -> 0x0194, TRY_ENTER, TRY_LEAVE, TryCatch #26 {all -> 0x0194, blocks: (B:102:0x017a, B:104:0x0186, B:113:0x0197), top: B:265:0x017a, outer: #27 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:128:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:129:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:138:0x01df A[Catch: all -> 0x0214, TryCatch #25 {all -> 0x0214, blocks: (B:136:0x01d9, B:138:0x01df, B:139:0x01e3, B:141:0x01e9, B:142:0x01ee, B:162:0x0217, B:163:0x021e), top: B:264:0x01d9, outer: #23 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x01e9 A[Catch: all -> 0x0214, LOOP:0: B:139:0x01e3->B:141:0x01e9, LOOP_END, TryCatch #25 {all -> 0x0214, blocks: (B:136:0x01d9, B:138:0x01df, B:139:0x01e3, B:141:0x01e9, B:142:0x01ee, B:162:0x0217, B:163:0x021e), top: B:264:0x01d9, outer: #23 }] */
    /* JADX WARN: Code duplicated, block: B:191:0x0256  */
    /* JADX WARN: Code duplicated, block: B:194:0x025f  */
    /* JADX WARN: Code duplicated, block: B:21:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:251:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:0x01d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:272:0x01c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:273:0x0175 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x01ee A[EDGE_INSN: B:275:0x01ee->B:142:0x01ee BREAK  A[LOOP:0: B:139:0x01e3->B:141:0x01e9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c9 A[Catch: all -> 0x00dc, IllegalStateException -> 0x00df, IOException -> 0x00e1, TRY_LEAVE, TryCatch #29 {IOException -> 0x00e1, IllegalStateException -> 0x00df, blocks: (B:31:0x00bf, B:33:0x00c9, B:44:0x00e3, B:45:0x00e8), top: B:271:0x00bf, outer: #30 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e3 A[Catch: all -> 0x00dc, IllegalStateException -> 0x00df, IOException -> 0x00e1, TRY_ENTER, TryCatch #29 {IOException -> 0x00e1, IllegalStateException -> 0x00df, blocks: (B:31:0x00bf, B:33:0x00c9, B:44:0x00e3, B:45:0x00e8), top: B:271:0x00bf, outer: #30 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0124 A[Catch: all -> 0x0139, TRY_LEAVE, TryCatch #13 {all -> 0x0139, blocks: (B:66:0x0118, B:68:0x0124, B:79:0x013c, B:80:0x0141), top: B:251:0x0118 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x013c A[Catch: all -> 0x0139, TRY_ENTER, TryCatch #13 {all -> 0x0139, blocks: (B:66:0x0118, B:68:0x0124, B:79:0x013c, B:80:0x0141), top: B:251:0x0118 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x014b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x014d A[Catch: IllegalStateException -> 0x0133, IOException -> 0x0135, FileNotFoundException -> 0x0137, TRY_LEAVE, TryCatch #26 {FileNotFoundException -> 0x0137, IOException -> 0x0135, IllegalStateException -> 0x0133, blocks: (B:64:0x0110, B:69:0x012e, B:87:0x014d, B:85:0x014a, B:84:0x0147), top: B:274:0x0110 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0163  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        FileInputStream fileInputStreamM1595;
        C2754[] c2754ArrM1054;
        C2754[] c2754Arr;
        C3121 c3121;
        C2754[] c2754Arr2;
        byte[] bArr;
        byte[] bArr2;
        ByteArrayInputStream byteArrayInputStream;
        FileOutputStream fileOutputStream;
        FileChannel channel;
        FileLock fileLockTryLock;
        byte[] bArr3;
        int i;
        boolean z;
        ByteArrayOutputStream byteArrayOutputStream;
        C0721 c0721;
        FileInputStream fileInputStreamM1596;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if (!"androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
                Bundle extras2 = intent.getExtras();
                if (extras2 != null) {
                    String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                    if (!"WRITE_SKIP_FILE".equals(string)) {
                        if ("DELETE_SKIP_FILE".equals(string)) {
                            new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                            Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                            setResultCode(11);
                            return;
                        }
                        return;
                    }
                    C3121 c3122 = new C3121(14, this);
                    try {
                        AbstractC1631.m3429(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                        c3122.m5749(10, null);
                        return;
                    } catch (PackageManager.NameNotFoundException e) {
                        c3122.m5749(7, e);
                        return;
                    }
                }
                return;
            }
            if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
                Process.sendSignal(Process.myPid(), 10);
                Log.d("ProfileInstaller", "");
                setResultCode(12);
                return;
            } else {
                if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
                    return;
                }
                String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
                C3121 c3123 = new C3121(14, this);
                if (!"DROP_SHADER_CACHE".equals(string2)) {
                    c3123.m5749(16, null);
                    return;
                }
                if (AbstractC2133.m4146(Build.VERSION.SDK_INT >= 34 ? context.createDeviceProtectedStorageContext().getCacheDir() : context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
                    c3123.m5749(14, null);
                    return;
                } else {
                    c3123.m5749(15, null);
                    return;
                }
            }
        }
        ExecutorC4322 executorC4322 = new ExecutorC4322(1);
        C3121 c3124 = new C3121(14, this);
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            byte[] bArr4 = AbstractC0487.f1775;
            File file = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            C0721 c0722 = new C0721(assets, executorC4322, c3124, name, file);
            byte[] bArr5 = c0722.f2632;
            if (bArr5 != null) {
                if (!file.exists()) {
                    try {
                        if (file.createNewFile()) {
                            c0722.f2630 = true;
                            fileInputStreamM1595 = c0722.m1595(assets, "dexopt/baseline.prof");
                            if (fileInputStreamM1595 != null) {
                                if (Arrays.equals(bArr4, AbstractC2552.m4795(fileInputStreamM1595, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                c2754ArrM1054 = AbstractC0487.m1054(fileInputStreamM1595, AbstractC2552.m4795(fileInputStreamM1595, 4), c0722.f2634);
                                fileInputStreamM1595.close();
                                c0722.f2631 = c2754ArrM1054;
                            }
                            c2754Arr = c0722.f2631;
                            if (c2754Arr != null) {
                                fileInputStreamM1596 = c0722.m1595(assets, "dexopt/baseline.profm");
                                if (fileInputStreamM1596 == null) {
                                    if (fileInputStreamM1596 != null) {
                                        fileInputStreamM1596.close();
                                    }
                                    c0721 = null;
                                } else {
                                    if (Arrays.equals(AbstractC0487.f1774, AbstractC2552.m4795(fileInputStreamM1596, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    c0722.f2631 = AbstractC0487.m1053(fileInputStreamM1596, AbstractC2552.m4795(fileInputStreamM1596, 4), bArr5, c2754Arr);
                                    fileInputStreamM1596.close();
                                    c0721 = c0722;
                                }
                                if (c0721 != null) {
                                    c0722 = c0721;
                                }
                            }
                            c3121 = c0722.f2633;
                            c2754Arr2 = c0722.f2631;
                            bArr = c0722.f2632;
                            if (c2754Arr2 != null) {
                                if (c0722.f2630) {
                                    C1078.m2276("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                byteArrayOutputStream.write(bArr4);
                                byteArrayOutputStream.write(bArr);
                                if (AbstractC0487.m1045(byteArrayOutputStream, bArr, c2754Arr2)) {
                                    c0722.f2635 = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    c0722.f2631 = null;
                                } else {
                                    c3121.m5749(5, null);
                                    c0722.f2631 = null;
                                    byteArrayOutputStream.close();
                                }
                            }
                            bArr2 = c0722.f2635;
                            if (bArr2 != null) {
                                if (c0722.f2630) {
                                    C1078.m2276("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                fileOutputStream = new FileOutputStream(c0722.f2629);
                                channel = fileOutputStream.getChannel();
                                fileLockTryLock = channel.tryLock();
                                if (fileLockTryLock != null) {
                                    if (fileLockTryLock.isValid()) {
                                        bArr3 = new byte[512];
                                        while (true) {
                                            i = byteArrayInputStream.read(bArr3);
                                            if (i > 0) {
                                                break;
                                                break;
                                            }
                                            fileOutputStream.write(bArr3, 0, i);
                                        }
                                        c0722.m1594(1, null);
                                        fileLockTryLock.close();
                                        channel.close();
                                        fileOutputStream.close();
                                        byteArrayInputStream.close();
                                        c0722.f2635 = null;
                                        c0722.f2631 = null;
                                        z = true;
                                    }
                                }
                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                            }
                            z = false;
                            if (z) {
                                AbstractC1631.m3429(packageInfo, filesDir);
                            }
                        } else {
                            c0722.m1594(4, null);
                        }
                    } catch (IOException unused) {
                        c0722.m1594(4, null);
                    }
                } else if (file.canWrite()) {
                    c0722.f2630 = true;
                    try {
                        fileInputStreamM1595 = c0722.m1595(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e2) {
                        c3124.m5749(6, e2);
                        fileInputStreamM1595 = null;
                    } catch (IOException e3) {
                        c3124.m5749(7, e3);
                        fileInputStreamM1595 = null;
                    }
                    try {
                        if (fileInputStreamM1595 != null) {
                            try {
                                if (Arrays.equals(bArr4, AbstractC2552.m4795(fileInputStreamM1595, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                c2754ArrM1054 = AbstractC0487.m1054(fileInputStreamM1595, AbstractC2552.m4795(fileInputStreamM1595, 4), c0722.f2634);
                                try {
                                    fileInputStreamM1595.close();
                                } catch (IOException e4) {
                                    c3124.m5749(7, e4);
                                }
                                c0722.f2631 = c2754ArrM1054;
                            } catch (IOException e5) {
                                c3124.m5749(7, e5);
                                try {
                                    fileInputStreamM1595.close();
                                } catch (IOException e6) {
                                    c3124.m5749(7, e6);
                                }
                                c2754ArrM1054 = null;
                            } catch (IllegalStateException e7) {
                                c3124.m5749(8, e7);
                                fileInputStreamM1595.close();
                                c2754ArrM1054 = null;
                            }
                        }
                        c2754Arr = c0722.f2631;
                        if (c2754Arr != null && Build.VERSION.SDK_INT >= 31) {
                            try {
                                fileInputStreamM1596 = c0722.m1595(assets, "dexopt/baseline.profm");
                                if (fileInputStreamM1596 == null) {
                                    try {
                                        if (Arrays.equals(AbstractC0487.f1774, AbstractC2552.m4795(fileInputStreamM1596, 4))) {
                                            throw new IllegalStateException("Invalid magic");
                                        }
                                        c0722.f2631 = AbstractC0487.m1053(fileInputStreamM1596, AbstractC2552.m4795(fileInputStreamM1596, 4), bArr5, c2754Arr);
                                        fileInputStreamM1596.close();
                                        c0721 = c0722;
                                    } catch (Throwable th) {
                                        try {
                                            fileInputStreamM1596.close();
                                            throw th;
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                            throw th;
                                        }
                                    }
                                } else {
                                    if (fileInputStreamM1596 != null) {
                                        fileInputStreamM1596.close();
                                    }
                                    c0721 = null;
                                }
                            } catch (FileNotFoundException e8) {
                                c3124.m5749(9, e8);
                            } catch (IOException e9) {
                                c3124.m5749(7, e9);
                            } catch (IllegalStateException e10) {
                                c0722.f2631 = null;
                                c3124.m5749(8, e10);
                            }
                            if (c0721 != null) {
                                c0722 = c0721;
                            }
                        }
                        c3121 = c0722.f2633;
                        c2754Arr2 = c0722.f2631;
                        bArr = c0722.f2632;
                        if (c2754Arr2 != null && bArr != null) {
                            if (c0722.f2630) {
                                C1078.m2276("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr4);
                                    byteArrayOutputStream.write(bArr);
                                    if (AbstractC0487.m1045(byteArrayOutputStream, bArr, c2754Arr2)) {
                                        c3121.m5749(5, null);
                                        c0722.f2631 = null;
                                        byteArrayOutputStream.close();
                                    } else {
                                        c0722.f2635 = byteArrayOutputStream.toByteArray();
                                        byteArrayOutputStream.close();
                                        c0722.f2631 = null;
                                    }
                                } catch (Throwable th3) {
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th3;
                                    } catch (Throwable th4) {
                                        th3.addSuppressed(th4);
                                        throw th3;
                                    }
                                }
                            } catch (IOException e11) {
                                c3121.m5749(7, e11);
                            } catch (IllegalStateException e12) {
                                c3121.m5749(8, e12);
                            }
                        }
                        bArr2 = c0722.f2635;
                        if (bArr2 != null) {
                            z = false;
                        } else {
                            try {
                                if (c0722.f2630) {
                                    C1078.m2276("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                try {
                                    byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                    try {
                                        fileOutputStream = new FileOutputStream(c0722.f2629);
                                        try {
                                            channel = fileOutputStream.getChannel();
                                            try {
                                                fileLockTryLock = channel.tryLock();
                                                if (fileLockTryLock != null) {
                                                    try {
                                                        if (fileLockTryLock.isValid()) {
                                                            bArr3 = new byte[512];
                                                            while (true) {
                                                                i = byteArrayInputStream.read(bArr3);
                                                                if (i > 0) {
                                                                    break;
                                                                } else {
                                                                    fileOutputStream.write(bArr3, 0, i);
                                                                }
                                                            }
                                                            c0722.m1594(1, null);
                                                            fileLockTryLock.close();
                                                            channel.close();
                                                            fileOutputStream.close();
                                                            byteArrayInputStream.close();
                                                            c0722.f2635 = null;
                                                            c0722.f2631 = null;
                                                            z = true;
                                                        }
                                                    } catch (Throwable th5) {
                                                        if (fileLockTryLock == null) {
                                                            throw th5;
                                                        }
                                                        try {
                                                            fileLockTryLock.close();
                                                            throw th5;
                                                        } catch (Throwable th6) {
                                                            th5.addSuppressed(th6);
                                                            throw th5;
                                                        }
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th;
                                                        } catch (Throwable th7) {
                                                            th.addSuppressed(th7);
                                                            throw th;
                                                        }
                                                    }
                                                }
                                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                            } catch (Throwable th8) {
                                                if (channel == null) {
                                                    throw th8;
                                                }
                                                try {
                                                    channel.close();
                                                    throw th8;
                                                } catch (Throwable th9) {
                                                    th8.addSuppressed(th9);
                                                    throw th8;
                                                }
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th10) {
                                                    th.addSuppressed(th10);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th11) {
                                            fileOutputStream.close();
                                            throw th11;
                                        }
                                    } catch (Throwable th12) {
                                        byteArrayInputStream.close();
                                        throw th12;
                                    }
                                } catch (FileNotFoundException e13) {
                                    c0722.m1594(6, e13);
                                    c0722.f2635 = null;
                                    c0722.f2631 = null;
                                    z = false;
                                } catch (IOException e14) {
                                    c0722.m1594(7, e14);
                                    c0722.f2635 = null;
                                    c0722.f2631 = null;
                                    z = false;
                                }
                            } catch (Throwable th13) {
                                c0722.f2635 = null;
                                c0722.f2631 = null;
                                throw th13;
                            }
                        }
                        if (z) {
                            AbstractC1631.m3429(packageInfo, filesDir);
                        }
                    } catch (Throwable th14) {
                        try {
                            fileInputStreamM1595.close();
                            throw th14;
                        } catch (IOException e15) {
                            c3124.m5749(7, e15);
                            throw th14;
                        }
                    }
                } else {
                    c0722.m1594(4, null);
                }
                AbstractC4361.m7665(context, z);
            }
            c0722.m1594(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z = false;
            AbstractC4361.m7665(context, z);
        } catch (PackageManager.NameNotFoundException e16) {
            c3124.m5749(7, e16);
            AbstractC4361.m7665(context, false);
        }
    }
}
