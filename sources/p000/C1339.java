package p000;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: renamed from: ۥٔؔؔۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1339 extends C5858 {

    /* JADX INFO: renamed from: ۦٌ */
    public final Socket f4621;

    public C1339(Socket socket) {
        this.f4621 = socket;
    }

    @Override // p000.C5858
    /* JADX INFO: renamed from: ۦِ */
    public final void mo2853() {
        Socket socket = this.f4621;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (e.getCause() != null) {
                String message = e.getMessage();
                if (message != null ? AbstractC0684.m1527(message, "getsockname failed", false) : false) {
                    AbstractC2235.f7403.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
                    return;
                }
            }
            throw e;
        } catch (Exception e2) {
            AbstractC2235.f7403.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final IOException m2854(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
