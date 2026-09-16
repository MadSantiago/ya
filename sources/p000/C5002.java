package p000;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.Choreographer;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.autofill.AutofillId;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Type;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: ۦۘؑۚٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C5002 implements InterfaceC5138, InterfaceC3814, InterfaceC2387, InterfaceC3901, InterfaceC2003 {

    /* JADX INFO: renamed from: ۥْ */
    public Object f16550;

    /* JADX INFO: renamed from: ۦ۟ */
    public Object f16551;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f16552;

    /* JADX INFO: renamed from: ۥٓ */
    public static final int[] f16549 = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: ۥَ */
    public static final C4992 f16548 = new C4992(17);

    public C5002(int i) {
        this.f16552 = i;
        switch (i) {
            case 13:
                this.f16551 = new AtomicInteger(0);
                this.f16550 = new AtomicBoolean(false);
                break;
            case 24:
                this.f16551 = new C5426(0);
                this.f16550 = new C5426(0);
                break;
            case 28:
                this.f16551 = new ArrayList();
                this.f16550 = new ArrayList();
                break;
            default:
                this.f16551 = Choreographer.getInstance();
                this.f16550 = Looper.myLooper();
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ۥّ */
    public static C5002 m8391(Context context) {
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
                try {
                    return new C5002(19, channel, fileLockLock, false);
                } catch (IOException e) {
                    e = e;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                } catch (Error e2) {
                    e = e2;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                } catch (OverlappingFileLockException e3) {
                    e = e3;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException e4) {
                e = e4;
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e5) {
            e = e5;
            channel = null;
            fileLockLock = null;
        }
    }

    /* JADX INFO: renamed from: ۥؓ */
    public void mo5327(AttributeSet attributeSet, int i) {
        boolean z = true;
        switch (this.f16552) {
            case 1:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f16551;
                C5460 c5460M9119 = C5460.m9119(absSeekBar.getContext(), attributeSet, f16549, i);
                Drawable drawableM9121 = c5460M9119.m9121(0);
                if (drawableM9121 != null) {
                    if (drawableM9121 instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableM9121;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i2 = 0; i2 < numberOfFrames; i2++) {
                            Drawable drawableM8410 = m8410(animationDrawable.getFrame(i2), true);
                            drawableM8410.setLevel(10000);
                            animationDrawable2.addFrame(drawableM8410, animationDrawable.getDuration(i2));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableM9121 = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableM9121);
                }
                Drawable drawableM9122 = c5460M9119.m9121(1);
                if (drawableM9122 != null) {
                    absSeekBar.setProgressDrawable(m8410(drawableM9122, false));
                }
                c5460M9119.m9126();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f16551).getContext().obtainStyledAttributes(attributeSet, AbstractC5618.f18527, i, 0);
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(14)) {
                        z = typedArrayObtainStyledAttributes.getBoolean(14, true);
                        break;
                    }
                    typedArrayObtainStyledAttributes.recycle();
                    m8407(z);
                    return;
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    /* JADX INFO: renamed from: ۥؔ */
    public void m8392() {
        Object parcelable;
        Integer num;
        C0331 c0331 = (C0331) this.f16551;
        String str = (String) this.f16550;
        Bundle bundle = c0331.f1239;
        LinkedHashMap linkedHashMap = c0331.f1235;
        if (!c0331.f1238.contains(str) && (num = (Integer) c0331.f1236.remove(str)) != null) {
            c0331.f1237.remove(num);
        }
        c0331.f1234.remove(str);
        if (linkedHashMap.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        if (bundle.containsKey(str)) {
            if (Build.VERSION.SDK_INT >= 34) {
                parcelable = AbstractC2207.m4267(str, bundle);
            } else {
                parcelable = bundle.getParcelable(str);
                if (!C2233.class.isInstance(parcelable)) {
                    parcelable = null;
                }
            }
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((C2233) parcelable));
            bundle.remove(str);
        }
        if (c0331.f1233.get(str) == null) {
            return;
        }
        C0178.m382();
    }

    /* JADX INFO: renamed from: ۥؖ */
    public KeyListener m8393(KeyListener keyListener) {
        if ((keyListener instanceof NumberKeyListener) || (keyListener instanceof C2706)) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new C2706(keyListener);
    }

    @Override // p000.InterfaceC5138
    /* JADX INFO: renamed from: ۥؗ */
    public InterfaceC3879 mo5739(String str) {
        FileChannel fileChannel;
        FileChannel fileChannel2;
        C3352 c3352 = (C3352) this.f16550;
        if (!str.equals(":memory:")) {
            str = c3352.f11207.f1666.getDatabasePath(str).getAbsolutePath();
        }
        boolean z = true;
        C0198 c0198 = new C0198(str, (c3352.f11211 || c3352.f11210 || AbstractC3831.m6874(str, ":memory:")) ? false : true);
        ReentrantLock reentrantLock = c0198.f730;
        reentrantLock.lock();
        C5002 c5002 = c0198.f729;
        if (c5002 != null) {
            try {
                c5002.m8405();
            } catch (Throwable th) {
                th = th;
                z = false;
            }
        }
        try {
            try {
                if (c3352.f11210) {
                    throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
                }
                InterfaceC3879 interfaceC3879Mo5739 = ((InterfaceC5138) this.f16551).mo5739(str);
                if (c3352.f11211) {
                    if (c3352.f11207.f1673 == 3) {
                        C4773.m8153(interfaceC3879Mo5739, "PRAGMA synchronous = NORMAL");
                    } else {
                        C4773.m8153(interfaceC3879Mo5739, "PRAGMA synchronous = FULL");
                    }
                    C3352.m6115(interfaceC3879Mo5739);
                    c3352.f11212.mo1689(interfaceC3879Mo5739);
                } else {
                    try {
                        c3352.f11210 = true;
                        c3352.m6119(interfaceC3879Mo5739);
                        c3352.f11210 = false;
                    } catch (Throwable th2) {
                        c3352.f11210 = false;
                        throw th2;
                    }
                }
                if (c5002 != null && (fileChannel2 = (FileChannel) c5002.f16550) != null) {
                    try {
                        fileChannel2.close();
                        c5002.f16550 = null;
                    } catch (Throwable th3) {
                        c5002.f16550 = null;
                        throw th3;
                    }
                }
                reentrantLock.unlock();
                return interfaceC3879Mo5739;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            if (c5002 != null && (fileChannel = (FileChannel) c5002.f16550) != null) {
                try {
                    fileChannel.close();
                } finally {
                    c5002.f16550 = null;
                }
            }
            throw th5;
        }
        th = th4;
        try {
            if (z) {
                throw th;
            }
            throw new IllegalStateException("Unable to open database '" + str + "'. Was a proper path / name used in Room's database builder?", th);
        } catch (Throwable th6) {
            reentrantLock.unlock();
            throw th6;
        }
    }

    /* JADX INFO: renamed from: ۥً */
    public AutofillId m8394(long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC5183.m8784(AbstractC2875.m5448(this.f16550), ((View) this.f16551).getAutofillId(), j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥَ */
    public void m8395(AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308, boolean z) {
        AbstractComponentCallbacksC0308 abstractComponentCallbacksC0309 = ((C2790) this.f16551).f9308;
        if (abstractComponentCallbacksC0309 != null) {
            abstractComponentCallbacksC0309.m657().f9336.m8395(abstractComponentCallbacksC0308, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16550).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                C0178.m382();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    @Override // p000.InterfaceC2387
    /* JADX INFO: renamed from: ۥُ */
    public Object mo4464(C0724 c0724) {
        Executor executor = (Executor) this.f16550;
        return executor == null ? c0724 : new C4717(executor, c0724);
    }

    /* JADX INFO: renamed from: ۥْ */
    public void m8396(AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308, boolean z) {
        AbstractComponentCallbacksC0308 abstractComponentCallbacksC0309 = ((C2790) this.f16551).f9308;
        if (abstractComponentCallbacksC0309 != null) {
            abstractComponentCallbacksC0309.m657().f9336.m8396(abstractComponentCallbacksC0308, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16550).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                C0178.m382();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: ۥٓ */
    public void m8397(AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308, boolean z) {
        C2790 c2790 = (C2790) this.f16551;
        AbstractActivityC2747 abstractActivityC2747 = c2790.f9309.f2924;
        AbstractComponentCallbacksC0308 abstractComponentCallbacksC0309 = c2790.f9308;
        if (abstractComponentCallbacksC0309 != null) {
            abstractComponentCallbacksC0309.m657().f9336.m8397(abstractComponentCallbacksC0308, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16550).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                C0178.m382();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: ۥٕ */
    public void m8398(AbstractC3305 abstractC3305) {
        C1489 c1489 = (C1489) this.f16551;
        ((ActionMode.Callback) c1489.f5059).onDestroyActionMode(c1489.m3139(abstractC3305));
        LayoutInflaterFactory2C1852 layoutInflaterFactory2C1852 = (LayoutInflaterFactory2C1852) this.f16550;
        if (layoutInflaterFactory2C1852.f6177 != null) {
            layoutInflaterFactory2C1852.f6147.getDecorView().removeCallbacks(layoutInflaterFactory2C1852.f6180);
        }
        if (layoutInflaterFactory2C1852.f6169 != null) {
            C1551 c1551 = layoutInflaterFactory2C1852.f6182;
            if (c1551 != null) {
                c1551.m3299();
            }
            C1551 c1551M6432 = AbstractC3608.m6432(layoutInflaterFactory2C1852.f6169);
            c1551M6432.m3300(0.0f);
            layoutInflaterFactory2C1852.f6182 = c1551M6432;
            c1551M6432.m3301(new C2751(2, this));
        }
        layoutInflaterFactory2C1852.f6176 = null;
        ViewGroup viewGroup = layoutInflaterFactory2C1852.f6187;
        WeakHashMap weakHashMap = AbstractC3608.f12013;
        viewGroup.requestApplyInsets();
        layoutInflaterFactory2C1852.m3654();
    }

    /* JADX INFO: renamed from: ۥٖ */
    public void m8399(AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308, boolean z) {
        AbstractComponentCallbacksC0308 abstractComponentCallbacksC0309 = ((C2790) this.f16551).f9308;
        if (abstractComponentCallbacksC0309 != null) {
            abstractComponentCallbacksC0309.m657().f9336.m8399(abstractComponentCallbacksC0308, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16550).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                C0178.m382();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: ۥٙ */
    public InputMethodManager m8400() {
        return (InputMethodManager) ((InterfaceC5130) this.f16550).getValue();
    }

    /* JADX INFO: renamed from: ۥۖ */
    public void m8401(AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308, boolean z) {
        AbstractComponentCallbacksC0308 abstractComponentCallbacksC0309 = ((C2790) this.f16551).f9308;
        if (abstractComponentCallbacksC0309 != null) {
            abstractComponentCallbacksC0309.m657().f9336.m8401(abstractComponentCallbacksC0308, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16550).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                C0178.m382();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    @Override // p000.InterfaceC3901
    /* JADX INFO: renamed from: ۥۗ */
    public void mo3081(Throwable th) {
        ((C4717) this.f16550).f15550.execute(new RunnableC5689(this, (InterfaceC3901) this.f16551, th));
    }

    /* JADX INFO: renamed from: ۥۙ */
    public void m8402(int i, Bundle bundle) {
        Locale locale = Locale.US;
        String str = "Analytics listener received message. ID: " + i + ", Extras: " + bundle;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            InterfaceC1981 interfaceC1981 = "clx".equals(bundle2.getString("_o")) ? (C2808) this.f16551 : (C5086) this.f16550;
            if (interfaceC1981 == null) {
                return;
            }
            interfaceC1981.mo3870(string, bundle2);
        }
    }

    /* JADX INFO: renamed from: ۥۜ */
    public boolean m8403() {
        synchronized (this) {
            if (((AtomicBoolean) this.f16550).get()) {
                return false;
            }
            ((AtomicInteger) this.f16551).incrementAndGet();
            return true;
        }
    }

    @Override // p000.InterfaceC3901
    /* JADX INFO: renamed from: ۥۣ */
    public void mo3082(InterfaceC5065 interfaceC5065, C4633 c4633) {
        ((C4717) this.f16550).f15550.execute(new RunnableC3599(this, (InterfaceC3901) this.f16551, c4633, 2));
    }

    /* JADX INFO: renamed from: ۥۦ */
    public void m8404() {
        try {
            ((FileLock) this.f16550).release();
            ((FileChannel) this.f16551).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    /* JADX INFO: renamed from: ۥۧ */
    public void m8405() throws IOException {
        String str = (String) this.f16551;
        if (((FileChannel) this.f16550) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.f16550 = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th) {
            FileChannel fileChannel = (FileChannel) this.f16550;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.f16550 = null;
            throw new IllegalStateException(AbstractC3761.m6629("Unable to lock file: '", str, "'."), th);
        }
    }

    @Override // p000.InterfaceC2387
    /* JADX INFO: renamed from: ۦؑ */
    public Type mo4465() {
        return (Type) this.f16551;
    }

    /* JADX INFO: renamed from: ۦؖ */
    public void m8406(C2413 c2413) {
        ExecutorC5176 executorC5176 = (ExecutorC5176) this.f16550;
        C3121 c3121 = (C3121) this.f16551;
        int i = c2413.f8032;
        if (i != 0) {
            executorC5176.execute(new RunnableC2054(c3121, i));
        } else {
            executorC5176.execute(new RunnableC4985(6, c3121, c2413.f8033));
        }
    }

    /* JADX INFO: renamed from: ۦؗ */
    public void m8407(boolean z) {
        C5432 c5432 = (C5432) ((C5002) ((C5086) this.f16550).f16877).f16550;
        if (c5432.f17923 != z) {
            c5432.f17923 = z;
            if (z) {
                AbstractC0949.m1933();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: ۦؙ */
    public boolean m8408(AbstractC3305 abstractC3305, Menu menu) {
        ViewGroup viewGroup = ((LayoutInflaterFactory2C1852) this.f16550).f6187;
        WeakHashMap weakHashMap = AbstractC3608.f12013;
        viewGroup.requestApplyInsets();
        C1489 c1489 = (C1489) this.f16551;
        ActionMode.Callback callback = (ActionMode.Callback) c1489.f5059;
        C3466 c3466M3139 = c1489.m3139(abstractC3305);
        C0796 c0796 = (C0796) c1489.f5056;
        Menu menuC4451 = (Menu) c0796.get(menu);
        if (menuC4451 == null) {
            menuC4451 = new MenuC4451((Context) c1489.f5057, (MenuC4903) menu);
            c0796.put(menu, menuC4451);
        }
        return callback.onPrepareActionMode(c3466M3139, menuC4451);
    }

    @Override // p000.InterfaceC3814
    /* JADX INFO: renamed from: ۦؚ */
    public C3580 mo4409(Object obj) {
        Boolean bool = (Boolean) obj;
        C4743 c4743 = (C4743) this.f16550;
        if (bool.booleanValue()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
            }
            boolean zBooleanValue = bool.booleanValue();
            C1377 c1377 = c4743.f15658;
            if (zBooleanValue) {
                ((C2332) c1377.f4715).m4374(null);
                return ((C3580) this.f16551).m6396((ExecutorC2291) c4743.f15655.f9378, new C4228(15, this));
            }
            C1078.m2276("An invalid data collection token was used.");
            return null;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
        }
        C2711 c2711 = c4743.f15667;
        Iterator it = C2711.m5033(((File) c2711.f8980).listFiles(C4743.f15653)).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
        C2711 c2712 = ((C1372) c4743.f15663.f11830).f4699;
        C1372.m2903(C2711.m5033(((File) c2712.f8979).listFiles()));
        C1372.m2903(C2711.m5033(((File) c2712.f8982).listFiles()));
        C1372.m2903(C2711.m5033(((File) c2712.f8983).listFiles()));
        c4743.f15657.m4374(null);
        return AbstractC5378.m9075(null);
    }

    /* JADX INFO: renamed from: ۦٌ */
    public void m8409(AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308, boolean z) {
        C2790 c2790 = (C2790) this.f16551;
        AbstractActivityC2747 abstractActivityC2747 = c2790.f9309.f2924;
        AbstractComponentCallbacksC0308 abstractComponentCallbacksC0309 = c2790.f9308;
        if (abstractComponentCallbacksC0309 != null) {
            abstractComponentCallbacksC0309.m657().f9336.m8409(abstractComponentCallbacksC0308, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16550).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                C0178.m382();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: ۦُ */
    public Drawable m8410(Drawable drawable, boolean z) {
        if (!(drawable instanceof LayerDrawable)) {
            if (!(drawable instanceof BitmapDrawable)) {
                return drawable;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.f16550) == null) {
                this.f16550 = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i = 0; i < numberOfLayers; i++) {
            int id = layerDrawable.getId(i);
            drawableArr[i] = m8410(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
        for (int i2 = 0; i2 < numberOfLayers; i2++) {
            layerDrawable2.setId(i2, layerDrawable.getId(i2));
            layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
            layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
            layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
            layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
            layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
            layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
            layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
            layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
            layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
        }
        return layerDrawable2;
    }

    @Override // p000.InterfaceC2003
    /* JADX INFO: renamed from: ۦِ */
    public Object mo804(Object obj) throws IOException {
        Charset charsetM1719;
        AbstractC2978 abstractC2978 = (AbstractC2978) obj;
        C1039 c1039 = (C1039) this.f16550;
        InterfaceC4734 interfaceC4734 = (InterfaceC4734) this.f16551;
        InterfaceC4473 interfaceC4473Mo3797 = abstractC2978.mo3797();
        try {
            C0822 c0822Mo3795 = abstractC2978.mo3795();
            if (c0822Mo3795 == null || (charsetM1719 = c0822Mo3795.m1719(AbstractC4637.f15306)) == null) {
                charsetM1719 = AbstractC4637.f15306;
            }
            String strMo2679 = interfaceC4473Mo3797.mo2679(AbstractC4031.m7229(interfaceC4473Mo3797, charsetM1719));
            interfaceC4473Mo3797.close();
            return ((C0971) c1039.f3672).m2035(interfaceC4734, strMo2679);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC4554.m7932(interfaceC4473Mo3797, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ۦٕ */
    public void m8411(AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308, boolean z) {
        AbstractComponentCallbacksC0308 abstractComponentCallbacksC0309 = ((C2790) this.f16551).f9308;
        if (abstractComponentCallbacksC0309 != null) {
            abstractComponentCallbacksC0309.m657().f9336.m8411(abstractComponentCallbacksC0308, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16550).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                C0178.m382();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: ۦٖ */
    public void m8412() {
        synchronized (this) {
            ((AtomicInteger) this.f16551).decrementAndGet();
            if (((AtomicInteger) this.f16551).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    /* JADX INFO: renamed from: ۦٗ */
    public void m8413(AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308, Bundle bundle, boolean z) {
        AbstractComponentCallbacksC0308 abstractComponentCallbacksC0309 = ((C2790) this.f16551).f9308;
        if (abstractComponentCallbacksC0309 != null) {
            abstractComponentCallbacksC0309.m657().f9336.m8413(abstractComponentCallbacksC0308, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16550).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                C0178.m382();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: ۦٚ */
    public C5146 m8414(InputConnection inputConnection) {
        InputConnection inputConnection2;
        C5086 c5086 = (C5086) this.f16550;
        if (inputConnection == null) {
            inputConnection2 = null;
        } else {
            C5002 c5002 = (C5002) c5086.f16877;
            if (!(inputConnection instanceof C5146)) {
                inputConnection = new C5146((EditText) c5002.f16551, inputConnection);
            }
            inputConnection2 = inputConnection;
        }
        return (C5146) inputConnection2;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public void m8415() {
        String str = (String) this.f16551;
        try {
            new File((File) ((C2711) this.f16550).f8980, str).createNewFile();
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e);
        }
    }

    /* JADX INFO: renamed from: ۦۗ */
    public void m8416(AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308, boolean z) {
        AbstractComponentCallbacksC0308 abstractComponentCallbacksC0309 = ((C2790) this.f16551).f9308;
        if (abstractComponentCallbacksC0309 != null) {
            abstractComponentCallbacksC0309.m657().f9336.m8416(abstractComponentCallbacksC0308, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16550).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                C0178.m382();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public C5745 m8417(List list) {
        InterfaceC1400 interfaceC1400;
        Exception e;
        try {
            int size = list.size();
            int i = 0;
            interfaceC1400 = null;
            while (i < size) {
                try {
                    InterfaceC1400 interfaceC1401 = (InterfaceC1400) list.get(i);
                    try {
                        interfaceC1401.mo773((C1093) this.f16550);
                        i++;
                        interfaceC1400 = interfaceC1401;
                    } catch (Exception e2) {
                        e = e2;
                        interfaceC1400 = interfaceC1401;
                        StringBuilder sb = new StringBuilder();
                        StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                        sb2.append(((C1093) this.f16550).f3841.m1730());
                        sb2.append(", composition=");
                        sb2.append(((C1093) this.f16550).m2307());
                        sb2.append(", selection=");
                        C1093 c1093 = (C1093) this.f16550;
                        sb2.append((Object) C3346.m6111(AbstractC2765.m5145(c1093.f3840, c1093.f3838)));
                        sb2.append("):");
                        sb.append(sb2.toString());
                        sb.append('\n');
                        AbstractC0973.m2048(list, sb, "\n", new C0091(10, interfaceC1400, this), 60);
                        throw new RuntimeException(sb.toString(), e);
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            }
            C1093 c1094 = (C1093) this.f16550;
            c1094.getClass();
            C1249 c1249 = new C1249(c1094.f3841.toString());
            C1093 c1095 = (C1093) this.f16550;
            long jM5145 = AbstractC2765.m5145(c1095.f3840, c1095.f3838);
            C3346 c3346 = C3346.m6114(((C5745) this.f16551).f18943) ? null : new C3346(jM5145);
            C5745 c5745 = new C5745(c1249, c3346 != null ? c3346.f11197 : AbstractC2765.m5145(C3346.m6108(jM5145), C3346.m6109(jM5145)), ((C1093) this.f16550).m2307());
            this.f16551 = c5745;
            return c5745;
        } catch (Exception e4) {
            interfaceC1400 = null;
            e = e4;
        }
    }

    /* JADX INFO: renamed from: ۦۚ */
    public void m8418(AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308, boolean z) {
        AbstractComponentCallbacksC0308 abstractComponentCallbacksC0309 = ((C2790) this.f16551).f9308;
        if (abstractComponentCallbacksC0309 != null) {
            abstractComponentCallbacksC0309.m657().f9336.m8418(abstractComponentCallbacksC0308, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16550).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                C0178.m382();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: ۦۛ */
    public void m8419(AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308, boolean z) {
        AbstractComponentCallbacksC0308 abstractComponentCallbacksC0309 = ((C2790) this.f16551).f9308;
        if (abstractComponentCallbacksC0309 != null) {
            abstractComponentCallbacksC0309.m657().f9336.m8419(abstractComponentCallbacksC0308, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16550).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                C0178.m382();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public void m8420(AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308, boolean z) {
        AbstractComponentCallbacksC0308 abstractComponentCallbacksC0309 = ((C2790) this.f16551).f9308;
        if (abstractComponentCallbacksC0309 != null) {
            abstractComponentCallbacksC0309.m657().f9336.m8420(abstractComponentCallbacksC0308, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16550).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                C0178.m382();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: ۦۨ */
    public void m8421(AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308, boolean z) {
        AbstractComponentCallbacksC0308 abstractComponentCallbacksC0309 = ((C2790) this.f16551).f9308;
        if (abstractComponentCallbacksC0309 != null) {
            abstractComponentCallbacksC0309.m657().f9336.m8421(abstractComponentCallbacksC0308, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16550).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                C0178.m382();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public /* synthetic */ C5002(int i, Object obj, Object obj2, boolean z) {
        this.f16552 = i;
        this.f16551 = obj;
        this.f16550 = obj2;
    }

    public /* synthetic */ C5002(int i, boolean z) {
        this.f16552 = i;
    }

    public C5002(String str, AbstractC3831 abstractC3831, C0373 c0373) {
        this.f16552 = 6;
        this.f16550 = str;
        this.f16551 = abstractC3831;
    }

    public C5002(C2790 c2790) {
        this.f16552 = 29;
        this.f16551 = c2790;
        this.f16550 = new CopyOnWriteArrayList();
    }

    public C5002(C0331 c0331, String str, AbstractC5568 abstractC5568) {
        this.f16552 = 3;
        this.f16551 = c0331;
        this.f16550 = str;
    }

    public C5002(C1414 c1414) {
        this.f16552 = 15;
        this.f16551 = c1414;
        this.f16550 = new ArrayList();
    }

    public C5002(String str) {
        this.f16552 = 27;
        this.f16551 = str.concat(".lck");
    }

    public C5002(Context context) {
        this.f16552 = 23;
        this.f16551 = context;
        this.f16550 = null;
    }

    public C5002(C2711 c2711) {
        this.f16552 = 2;
        this.f16551 = c2711;
        this.f16550 = f16548;
    }

    public C5002(AbsSeekBar absSeekBar) {
        this.f16552 = 1;
        this.f16551 = absSeekBar;
    }

    public C5002(EditText editText, int i) {
        this.f16552 = i;
        switch (i) {
            case 26:
                this.f16551 = editText;
                C5432 c5432 = new C5432(editText);
                this.f16550 = c5432;
                editText.addTextChangedListener(c5432);
                if (C2189.f7266 == null) {
                    synchronized (C2189.f7267) {
                        try {
                            if (C2189.f7266 == null) {
                                C2189 c2189 = new C2189();
                                try {
                                    C2189.f7265 = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C2189.class.getClassLoader());
                                    break;
                                } catch (Throwable unused) {
                                }
                                C2189.f7266 = c2189;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                editText.setEditableFactory(C2189.f7266);
                return;
            default:
                this.f16551 = editText;
                this.f16550 = new C5086(editText);
                return;
        }
    }

    public C5002(View view) {
        this.f16552 = 0;
        this.f16551 = view;
        this.f16550 = AbstractC3933.m7095(3, new C0101(17, this));
    }

    public /* synthetic */ C5002(int i, Object obj, Object obj2) {
        this.f16552 = i;
        this.f16550 = obj;
        this.f16551 = obj2;
    }

    public C5002(C0254 c0254) {
        this.f16552 = 4;
        this.f16550 = c0254;
    }
}
